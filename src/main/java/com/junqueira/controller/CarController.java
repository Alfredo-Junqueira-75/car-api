package com.junqueira.controller;

import com.junqueira.dto.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.junqueira.service.CarService;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/")
    public String getMensegem(){return "rodou!!!!!!!";}

    @GetMapping("/car")
    public List<CarDTO> getALl(){
        return carService.getAll();
    }

    @PostMapping("/car")
    public CarDTO saveCar(@RequestBody CarDTO carDTO){return carService.save(carDTO);}

    @GetMapping("/car/{id}")
    public CarDTO findById(@PathVariable long id){ return carService.findById(id);}

    @DeleteMapping("/car/delete/{id}")
    public void deleteCar(@PathVariable long id){ carService.delete(id);}

}
