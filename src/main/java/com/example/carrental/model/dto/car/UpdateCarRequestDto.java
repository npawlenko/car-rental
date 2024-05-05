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
        "id",
        "dto"
})
@XmlRootElement(name = "updateRequest", namespace = "http://localhost:8080/services/car")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequestDto implements Serializable {
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private Long id;
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private CarDto dto;
}
