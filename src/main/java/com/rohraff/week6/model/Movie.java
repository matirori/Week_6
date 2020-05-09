package com.rohraff.week6.model;

import java.time.LocalDate;

public class Movie {

    private String name;
    private LocalDate productionYear;
    private String producer;

    public Movie() {
    }

    public Movie(String name, LocalDate productionYear, String producer) {
        this.name = name;
        this.productionYear = productionYear;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", producer='" + producer + '\'' +
                '}';
    }
}
