package com.junqueira.model;

import com.junqueira.dto.CarDTO;
import jakarta.persistence.*;

@Entity(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String marca;
    @Column
    private String modelo;
    @Column
    private String cor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static Car convert(CarDTO carDTO){
        Car car = new Car();
        car.setMarca(carDTO.getMarca());
        car.setModelo(carDTO.getModelo());
        car.setCor(carDTO.getCor());
        return car;
    }
}
