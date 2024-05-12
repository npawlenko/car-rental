package com.example.carrental.webservice;

import com.example.carrental.domain.Car;
import com.example.carrental.model.dto.CarDto;
import com.example.carrental.model.dto.car.*;
import com.example.carrental.security.annotation.RequireAdminRole;
import com.example.carrental.service.CarService;
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
public class CarWebService extends AbstractCrudWebService<Car, CarDto, Long> {
    private static final String NAMESPACE_URI = "http://localhost:8080/services/car";

    private final CarService service;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findByIdRequest")
    @ResponsePayload
    public CarDto findById(@RequestPayload FindCarByIdRequestDto findCarByIdRequestDto) {
        return super.findById(findCarByIdRequestDto.getId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findAllRequest")
    @ResponsePayload
    public CarListResponseDto findAllCars() {
        List<CarDto> list = super.findAll();
        return CarListResponseDto.builder().list(list).build();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createRequest")
    @ResponsePayload
    @RequireAdminRole
    public CarDto create(@RequestPayload CreateCarRequestDto createCarRequestDto) {
        return super.create(createCarRequestDto.getDto());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateRequest")
    @ResponsePayload
    @RequireAdminRole
    public CarDto update(@RequestPayload UpdateCarRequestDto updateCarRequestDto) {
        return super.update(updateCarRequestDto.getId(), updateCarRequestDto.getDto());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteByIdRequest")
    @RequireAdminRole
    public void deleteById(@RequestPayload DeleteCarByIdRequestDto deleteCarByIdRequestDto) {
        super.deleteById(deleteCarByIdRequestDto.getId());
    }
}
