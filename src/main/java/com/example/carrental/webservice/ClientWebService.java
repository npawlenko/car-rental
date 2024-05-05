package com.example.carrental.webservice;

import com.example.carrental.service.ClientService;
import com.example.carrental.model.dto.client.LoginRequestDto;
import com.example.carrental.model.dto.client.LoginResponseDto;
import com.example.carrental.model.dto.client.RegisterRequestDto;
import com.example.carrental.model.dto.client.RegisterResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@RequiredArgsConstructor
public class ClientWebService {
    private static final String NAMESPACE_URI = "http://localhost:8080/services/client";

    private final ClientService clientService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "registerRequest")
    @ResponsePayload
    public RegisterResponseDto register(@RequestPayload RegisterRequestDto registerRequestDTO) {
        return clientService.register(registerRequestDTO);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "loginRequest")
    @ResponsePayload
    public LoginResponseDto login(@RequestPayload LoginRequestDto loginRequestDTO) {
        return clientService.login(loginRequestDTO);
    }
}
