package com.company;

public class JavaOutOfMemoryErrorExample {

    public static void main(String[] args) {

        try {
            Integer[] array = new Integer[10000 * 10000 * 100000];
            System.out.println("Done");
        } catch (OutOfMemoryError e) {
            System.out.println("We have got the OutOfMemoryError");
        }
        }
    }
