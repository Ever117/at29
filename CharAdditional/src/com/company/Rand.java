package com.company;

import java.util.Random;

public class Rand {

    public void printRandomChars() {
        Random rand = new Random();
        System.out.println("There are the following random chars:");
        for (int i = 0; i < 10; i++) {
            System.out.print((char) (rand.nextInt(95) + 32) + " ");
        }
        System.out.println();

    }


    public void evenNumberSumm() {
        int sum = 0;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers is: " + sum);
    }


    public void randomNumberDiv() {
        Random rand = new Random();
        int x = rand.nextInt(1000);
        if (x % 3 == 0) {
            System.out.println(x + " is divided into 3");
        } else if (x % 5 == 0) {
            System.out.println(x + " is divided into 5");
        } else if (x % 7 == 0) {
            System.out.println(x + " is divided into 7");
        } else {
            System.out.println(x + " is not divided on none of these numbers 3/5/7");
        }
    }

    public void randomNumberAverage() {
        Random rand = new Random();
        long summ = 0;
        long avg = 0;
        System.out.println("Random numbers: ");
        for (int i = 0; i < 15; i++) {
            int y = rand.nextInt(1000);
            System.out.print(y + ", ");
            summ = summ + y;
        }
        avg = summ / 15;
        System.out.println();
        System.out.println("Average value is: " + avg);


    }

    public void randomNumber50() {
        int summ = 0;
        Random rand = new Random();
        for (int i = 0; i <= 50; i++) {
            int x = rand.nextInt(100);
            if (x % 7 == 0) {
                summ = summ + x;
            }
        }
        System.out.println("Summ of number which is devided into '7' (modulo): " + summ);
    }
}