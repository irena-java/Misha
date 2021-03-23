package com.company.entity;

public class TramvDvigatel extends Engine{
    private String model;
    private double volume;
    private int power;
    private EnginesType enginesType;

    public TramvDvigatel(String model, double volume, int power, EnginesType enginesType) {
        this.model = model;
        this.volume = volume;
        this.power = power;
        this.enginesType = enginesType;
    }

    @Override
    public void start() {
        System.out.println("старт трамвая");
    }

    @Override
    public void stop() {
        System.out.println("стоп трамв");
    }
}
