package com.company.entity;

public class Tramvay extends Machine{
    private String name;
    private String model;
    private Engine engine;
    private int speed;
    int numberTramvay;

    public Tramvay(String name, String model, Engine engine, int speed, int numberTramvay) {
        super(name,model,engine,speed);
        this.numberTramvay = numberTramvay;
    }

    @Override
    public void move() {
        System.out.println("дзынь-дзынь");
    }
}
