package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        VW car = new VW();
        car.setNameModel("Jetta");
        car.chooseCar(car.getNameModel());
        car.setNameModel("CC");
        car.chooseCar(car.getNameModel());
        car.NameModelConstructor("Passat");
        car.chooseCar(car.getNameModel());


        BMW car2 = new BMW();
        car2.setNameCar("BMW");
        car2.getNameCar();
        car2.setPatrol("Diesel");
        car2.chooseCar("520");


        Toyota car3 = new Toyota();
        car3.setNameCar("Toyota");
        car3.getNameCar();
        car3.setPatrol("Benz");
        car3.chooseCar("Yaris");
        car3.getLeastherSeats();



    }
}
