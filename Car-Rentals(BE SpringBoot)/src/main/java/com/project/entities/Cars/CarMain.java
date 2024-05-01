package com.project.entities.Cars;

import lombok.Data;

import com.project.dtos.Car.CarMainDto;

import jakarta.persistence.*;


@Entity
@Data 
@Table(name="carsmain")
public class CarMain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String color;

    private String transmission;

    private String brand;

    private String type;

    private String modelYear;

    private String employee;

    public CarMainDto getCarDto() {
        CarMainDto carmainDto = new CarMainDto();
        carmainDto.setId(id);
        carmainDto.setName(name);
        carmainDto.setColor(color);
        carmainDto.setType(type);
        carmainDto.setTransmission(transmission);
        carmainDto.setModelYear(modelYear);
        carmainDto.setBrand(brand);
        carmainDto.setEmployee(employee);

        return carmainDto;
    }
}



