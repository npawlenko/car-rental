package com.example.carrental.webservice;

import com.example.carrental.domain.Rental;
import com.example.carrental.model.dto.RentalDto;
import com.example.carrental.model.dto.rental.CreateRentalRequestDto;
import com.example.carrental.model.dto.rental.FindRentalByIdRequestDto;
import com.example.carrental.model.dto.rental.RentalListResponseDto;
import com.example.carrental.model.dto.rental.UpdateRentalRequestDto;
import com.example.carrental.security.annotation.RequireAdminRole;
import com.example.carrental.service.RentalService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
@RequiredArgsConstructor
@Getter
public class RentalWebService extends AbstractCrudWebService<Rental, RentalDto, Long> {
    private static final String NAMESPACE_URI = "http://localhost:8080/services/rental";

    private final RentalService service;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findByIdRequest")
    @ResponsePayload
    public RentalDto findById(@RequestPayload FindRentalByIdRequestDto findRentalByIdRequestDto) {
        return super.findById(findRentalByIdRequestDto.getId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findAllRequest")
    @ResponsePayload
    public RentalListResponseDto findAllRentals() {
        List<RentalDto> list = super.findAll();
        return RentalListResponseDto.builder().list(list).build();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createRequest")
    @ResponsePayload
    public RentalDto create(@RequestPayload CreateRentalRequestDto createRentalRequestDto) {
        return super.create(createRentalRequestDto.getDto());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateRequest")
    @ResponsePayload
    @RequireAdminRole
    public RentalDto update(@RequestPayload UpdateRentalRequestDto updateRentalRequestDto) {
        return super.update(updateRentalRequestDto.getId(), updateRentalRequestDto.getDto());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteByIdRequest")
    @RequireAdminRole
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}