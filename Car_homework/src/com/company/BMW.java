package com.company;

public class BMW extends German {

    private String nameModel;
    private String patrol;
    public String b;




    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public String getPatrol() {
        return patrol;
    }

    public void setPatrol(String patrol) {
        this.patrol = patrol;
    }


    @Override
    public void chooseCar(String k) {
    System.out.println("Car model number is: " + k + ", " + "Car uses petrol: " + patrol);
    }




}

