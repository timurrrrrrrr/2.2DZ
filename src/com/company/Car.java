package com.company;

public abstract class Car implements Printable {
    public Car() {

    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String model) {
        this.model = model;
    }

    private String model;

}
