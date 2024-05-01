package com.project.entities.Cars;

import com.project.dtos.Car.CarImageDto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="cars_image")
public class CarImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(columnDefinition = "longblob")
    private byte[] image; 

    public CarImageDto getCarImgDto(){
        CarImageDto carimgDto = new CarImageDto();
        carimgDto.setId(id);
        carimgDto.setImage(image);
        return carimgDto;
    }
}
