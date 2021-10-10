package com.company;

public class BMW extends Car implements Printable{
    private int year;
    private double volume;



    public BMW() {
        this.year=year;
        this.volume=volume;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("Model:" + getModel() + "\nYear:" + getYear() + "\nVolume:" + getVolume());


    }
}
