package com.example.services.admin;

import java.io.IOException;
import java.util.List;

import com.example.dtos.BookACarDto;
import com.example.dtos.CarDto;
import com.example.dtos.CarDtoList;
import com.example.dtos.SearchCarDto;

public interface AdminService {

    boolean postCar(CarDto carDto);

    List<CarDto> getAllCars();

    void deleteCar(Long carId);

    CarDto getCarById(Long cardId);

    boolean updateCar(Long carId,CarDto carDto) throws IOException;

    List<BookACarDto> getBookings();

    boolean changeBookingStatus(Long bookingId, String status);

    CarDtoList searchCar(SearchCarDto searchCarDto);

}
