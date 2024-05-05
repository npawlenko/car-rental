package com.example.carrental.model.dto;

import com.example.carrental.model.dto.car.CreateCarRequestDto;
import com.example.carrental.model.dto.car.FindCarByIdRequestDto;
import com.example.carrental.model.dto.car.UpdateCarRequestDto;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.carrental.model.dto.jaxb
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateCarRequestDto }
     *
     */
    public UpdateCarRequestDto createUpdateRequest() {
        return new UpdateCarRequestDto();
    }

    /**
     * Create an instance of {@link CarDto }
     *
     */
    public CarDto createCarDto() {
        return new CarDto();
    }

    public CreateCarRequestDto createCreateRequest() {
        return new CreateCarRequestDto();
    }

    /**
     * Create an instance of {@link FindCarByIdRequestDto }
     *
     */
    public FindCarByIdRequestDto createFindByIdRequest() {
        return new FindCarByIdRequestDto();
    }


    /**
     * Create an instance of {@link CarDto }
     *
     */
    public CarDto createFindByIdResponse() {
        return new CarDto();
    }

}
