package com.junqueira.dto;

import com.junqueira.model.Car;

public class CarDTO {
    private String marca;
    private String modelo;
    private String cor;

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

    public static CarDTO convert(Car car){
        CarDTO carDTO = new CarDTO();
        carDTO.setMarca(car.getMarca());
        carDTO.setModelo(car.getModelo());
        carDTO.setCor(car.getCor());
        return carDTO;
    }
}
