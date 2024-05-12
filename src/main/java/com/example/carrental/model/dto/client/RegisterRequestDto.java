package com.example.carrental.model.dto.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerRequest", namespace = "http://localhost:8080/services/client", propOrder = {
        "firstname",
        "lastname",
        "username",
        "password"
})
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@XmlRootElement(name = "registerRequest", namespace = "http://localhost:8080/services/client")
public class RegisterRequestDto {
    @XmlElement(namespace = "http://localhost:8080/services/client", required = true)
    private String firstname;
    @XmlElement(namespace = "http://localhost:8080/services/client", required = true)
    private String lastname;
    @XmlElement(namespace = "http://localhost:8080/services/client", required = true)
    private String username;
    @XmlElement(namespace = "http://localhost:8080/services/client", required = true)
    private String password;
}
