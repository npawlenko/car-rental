package com.example.carrental.model.enums;

import com.example.carrental.model.Translatable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transmission")
@XmlRootElement(name = "CarDto", namespace = "http://localhost:8080/services/car")
public enum Transmission implements Translatable {
    MANUAL,
    AUTOMATIC
}
