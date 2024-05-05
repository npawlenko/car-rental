package com.example.carrental.model.dto;

import com.example.carrental.domain.Rental;
import com.example.carrental.model.adapter.LocalDateTimeAdapter;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link Rental}
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "dateFrom",
        "dateTo",
        "car",
        "user"
})
@XmlRootElement(name = "RentalDto", namespace = "http://localhost:8080/services/rental")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public final class RentalDto implements Serializable {
    @XmlElement(namespace = "http://localhost:8080/services/rental")
    private Long id;
    @XmlElement(namespace = "http://localhost:8080/services/rental", required = true)
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime dateFrom;
    @XmlElement(namespace = "http://localhost:8080/services/rental", required = true)
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime dateTo;
    @XmlElement(namespace = "http://localhost:8080/services/rental", required = true)
    private DictionaryDto car;
    @XmlElement(namespace = "http://localhost:8080/services/rental", required = true)
    private DictionaryDto user;
}