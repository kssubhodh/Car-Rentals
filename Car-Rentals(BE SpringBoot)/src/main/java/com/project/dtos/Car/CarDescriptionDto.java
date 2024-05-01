package com.project.dtos.Car;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class CarDescriptionDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String description;

    private Integer price; 
}
