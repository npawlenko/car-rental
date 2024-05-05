package com.example.carrental.model.dto.client;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "accessToken"
})
@XmlRootElement(name = "loginResponse", namespace = "http://localhost:8080/services/client")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LoginResponseDto {
    @XmlElement(namespace = "http://localhost:8080/services/client", required = true)
    private String accessToken;
}
