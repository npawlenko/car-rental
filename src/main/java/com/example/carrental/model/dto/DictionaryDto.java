package com.example.carrental.model.dto;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "name"
})
@XmlRootElement(name = "DictionaryDto", namespace = "http://localhost:8080/services/rental")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public final class DictionaryDto {
    @XmlElement(namespace = "http://localhost:8080/services/rental", required = true)
    private Long id;
    @XmlElement(namespace = "http://localhost:8080/services/rental")
    private String name;
}
