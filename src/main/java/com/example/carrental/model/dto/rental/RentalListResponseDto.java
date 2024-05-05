package com.example.carrental.model.dto.rental;

import com.example.carrental.model.dto.CarDto;
import com.example.carrental.model.dto.RentalDto;
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
@XmlRootElement(name = "findAllResponse", namespace = "http://localhost:8080/services/rental")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RentalListResponseDto {
    @XmlElement(namespace = "http://localhost:8080/services/rental")
    private List<RentalDto> list;
}
