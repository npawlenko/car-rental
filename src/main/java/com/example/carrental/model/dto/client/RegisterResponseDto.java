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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@XmlRootElement(name = "registerResponse", namespace = "http://localhost:8080/services/client")
public class RegisterResponseDto {
    @XmlElement(namespace = "http://localhost:8080/services/client", required = true)
    private String accessToken;
}
