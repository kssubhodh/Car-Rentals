package com.example.services.customer;

import java.util.List;

import com.example.dtos.BookACarDto;
import com.example.dtos.CarDto;
import com.example.dtos.CarDtoList;
import com.example.dtos.SearchCarDto;

public interface CustomerService {

    List<CarDto> getAllCars();

    CarDto getCarById(Long carId);

    boolean bookACar(Long carId, BookACarDto bookACarDto);

    List<BookACarDto> getBookingsByUserId(Long userId);

    CarDtoList searchCar(SearchCarDto searchCarDto);

}
