package com.example.carrental.model.dto.car;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id"
})
@XmlRootElement(name = "findByIdRequest", namespace = "http://localhost:8080/services/car")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FindCarByIdRequestDto {
    @XmlElement(namespace = "http://localhost:8080/services/car", required = true)
    private Long id;
}
