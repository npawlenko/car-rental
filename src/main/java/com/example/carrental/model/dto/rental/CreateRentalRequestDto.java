package com.example.carrental.model.dto.rental;

import com.example.carrental.model.dto.RentalDto;
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
@XmlRootElement(name = "createRequest", namespace = "http://localhost:8080/services/rental")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateRentalRequestDto implements Serializable {
    @XmlElement(namespace = "http://localhost:8080/services/rental", required = true)
    private RentalDto dto;
}
