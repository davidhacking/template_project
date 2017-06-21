package com.pdd.phoenix.entity;

/**
 * Created by xiaozhan on 2017/6/20.
 */
public class TestData {
    public TestData() {}
    public TestData(String state, String city, String population) {
        this.state = state;
        this.city = city;
        this.population = population;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    private String state;
    private String city;
    private String population;

}
