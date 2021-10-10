package com.company;

public class Main {

    public static void main(String[] args) {


        createObject("Mersedes").print();

        System.out.println("_____________");

        createObject("BMW").print();


        System.out.println("_____________");

        createObject("TOYOTA").print();

        System.out.println("_____________");

    }

    public static Car createObject(String className){
        Printable Car = null;
        switch (className){
            case "Mersedes":
                Car = new Mersedes();
                break;
            case "BMW":
                Car = new BMW();
                break;
            case "TOYOTA":
                Car = new Toyota();


        }
        return (com.company.Car) Car;
    }


}

