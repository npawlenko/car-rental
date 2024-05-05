package com.example.carrental.model.dto.car;

import com.example.carrental.model.dto.CarDto;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "dto"
})
@XmlRootElement(name = "createRequest", namespace = "http://localhost:8080/services/car")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequestDto implements Serializable {
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private CarDto dto;
}