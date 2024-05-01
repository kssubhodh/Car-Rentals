package com.project.entities.Cars;

import com.project.dtos.Car.EmployeeDealershipDto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="employee_dealership")
public class EmployeeDealership {
    private String employee;
    private String dealership;

    public EmployeeDealershipDto getEmployeeDealership(){
        EmployeeDealershipDto empDto = new EmployeeDealershipDto();
        empDto.setDealership(dealership);
        empDto.setEmployee(employee);
        return empDto;
    }
}
