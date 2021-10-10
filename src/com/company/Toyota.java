package com.company;

public class Toyota extends Car implements Printable{
    private int year;
    private String colour;





    public Toyota() {

        super("TOYOTA");
        setColour("");
        setYear(year);

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public void print() {
        System.out.println("Model:"+getModel()+"\nYear:"+getYear()+"\nColour:"+getColour());

    }

    @Override
    public void createObject() {

    }
}
