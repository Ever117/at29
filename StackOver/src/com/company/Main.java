package com.company;

public class Main {

    Main() {
        System.out.println("SOFL");
    }
    Main m = new Main();

    public static void main(String[] args) {
        try {
            Main test = new Main();
        } catch (StackOverflowError e) {
            System.out.println("We have got the StackOverflowError");
        }

    }
}