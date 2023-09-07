package com.junqueira.service;

import com.junqueira.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.junqueira.repository.CarRepository;
import com.junqueira.dto.CarDTO;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<CarDTO> getAll(){
        return carRepository.findAll().stream().map(CarDTO::convert).collect(Collectors.toList());
    }

    public CarDTO save(CarDTO carDTO){
        Car car = carRepository.save(Car.convert(carDTO));
        return CarDTO.convert(car);
    }
    public CarDTO findById(long id){
        Optional<Car> car = carRepository.findById(id);
        return car.map(CarDTO::convert).orElse(null);
    }

    public void delete(long id){
        Optional<Car> car = carRepository.findById(id);
        car.ifPresent(value -> carRepository.delete(value));
    }
}
