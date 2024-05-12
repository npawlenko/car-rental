package com.example.carrental.model.dto;

import com.example.carrental.domain.Car;
import com.example.carrental.model.enums.CarModel;
import com.example.carrental.model.enums.Drive;
import com.example.carrental.model.enums.Fuel;
import com.example.carrental.model.enums.Transmission;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.io.Serializable;

/**
 * DTO for {@link Car}
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "model",
        "transmission",
        "color",
        "mileage",
        "yearOfProduction",
        "fuel",
        "secondaryFuel",
        "drive",
        "airConditioning",
        "pricePerHour",
        "picture"
})
@XmlRootElement(name = "CarDto", namespace = "http://localhost:8080/services/car")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public final class CarDto implements Serializable {
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private Long id;
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private CarModel model;
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private Transmission transmission;
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private String color;
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private Integer mileage;
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private Integer yearOfProduction;
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private Fuel fuel;
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private Fuel secondaryFuel;
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private Drive drive;
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private Boolean airConditioning;
    @XmlElement(namespace = "http://localhost:8080/services/car")
    private Float pricePerHour;
    @XmlElement(namespace = "http://localhost:8080/services/car")
    @XmlMimeType("image/*")
    private Image picture;
}