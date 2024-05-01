package com.project.entities.Cars;

import com.project.dtos.Car.CarDescriptionDto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="cardescription")
public class CarDescription {
    private String description;

    private Integer price; 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public CarDescriptionDto getCarDescritpionDto(){
        CarDescriptionDto cardescDto = new CarDescriptionDto();
        cardescDto.setId(id);
        cardescDto.setDescription(description);
        cardescDto.setPrice(price);

        return cardescDto;
    }
}
