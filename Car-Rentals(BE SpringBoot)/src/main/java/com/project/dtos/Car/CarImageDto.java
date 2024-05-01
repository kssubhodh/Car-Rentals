package com.project.dtos.Car;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class CarImageDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(columnDefinition = "longblob")
    private byte[] image; 
}
