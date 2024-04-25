package com.project.dtos;
import jakarta.persistence.Column;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
public class CarDto {

    private Long id;

    private String name;

    private String color;

    private String transmission;

    private String brand;

    private String type;

    private String modelYear;

    private String description;

    private Integer price;

    private MultipartFile image;

    private byte[] returnedImage;
    
    private String employee;
    
    private String dealership;

}

