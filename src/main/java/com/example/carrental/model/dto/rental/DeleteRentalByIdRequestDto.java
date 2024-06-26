package com.example.carrental.model.dto.rental;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id"
})
@XmlRootElement(name = "deleteByIdRequest", namespace = "http://localhost:8080/services/rental")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeleteRentalByIdRequestDto {
    @XmlElement(namespace = "http://localhost:8080/services/rental", required = true)
    private Long id;
}