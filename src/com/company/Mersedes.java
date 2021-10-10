package com.company;

public class Mersedes extends Car implements Printable{
    private int w;
    private String colour;


    public Mersedes() {
        super("Mersedes");
        setW(w);
        setColour(colour);

    }




    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void print() {
        System.out.println("Model:"+getModel()+"\nColour:"+getColour()+"\nBody:"+getW());

    }

    @Override
    public void createObject() {
        
    }


}
