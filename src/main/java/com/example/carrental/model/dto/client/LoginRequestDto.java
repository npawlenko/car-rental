package com.example.carrental.model.dto.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginRequest", namespace = "http://localhost:8080/services/client", propOrder = {
        "username",
        "password"
})
@XmlRootElement(name = "loginRequest", namespace = "http://localhost:8080/services/client")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LoginRequestDto {
    @XmlElement(namespace = "http://localhost:8080/services/client", required = true)
    public String username;
    @XmlElement(namespace = "http://localhost:8080/services/client", required = true)
    public String password;
}
