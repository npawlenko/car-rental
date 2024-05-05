package com.example.carrental.model.dto.car;

import com.example.carrental.model.dto.CarDto;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "list"
})
@XmlRootElement(name = "findAllResponse", namespace = "http://localhost:8080/services/car")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CarListResponseDto {
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private List<CarDto> list;
}
