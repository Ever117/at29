package com.company;

public class Toyota extends Japan {

    private String nameModel;
    private String patrol;

    public boolean getLeastherSeats() {
        return LeastherSeats;
    }

    public boolean LeastherSeats = true;



    public void setLeastherSeats(boolean leastherSeats) {
        this.leastherSeats = leastherSeats;
    }

    private boolean leastherSeats;
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
        System.out.println("Car model number is: " + k + ", " + "Car uses petrol: " + patrol + ", " +  "Leather seats: " + leastherSeats);
    }





}
