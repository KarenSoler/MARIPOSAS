package com.example.mariposas.entidades;

import java.io.Serializable;

public class Butter implements Serializable {
    private String name;
    private String especie;

    public Butter(String name, String especie) {
        this.name = name;
        this.especie = especie;
    }
    public double calculoVisita(){
        double pago= especie == "gusano" ? 10000 : 20000;
        return pago;
    }

    @Override
    public String toString() {
        return "Butter{" +
                "name='" + name + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }
}
