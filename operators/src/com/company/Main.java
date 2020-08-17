package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;
        System.out.println(previousResult);

        result -= 1;
        System.out.println(result);

        result++;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result -= result;
        System.out.println(result);

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It's not an alien");
        } else {
            System.out.println("It's an alien");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
            ;
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("Error");
        }

        boolean isCar = false;

        boolean wasCar = isCar ? true : false;
        if (!wasCar) {
            System.out.println("wasCar is false");
        }

        System.out.println();
        System.out.println("************CHALLENGE**********");

        double firstDouble = 20.00;
        double secondDouble = 80.00;

        firstDouble += secondDouble;
        firstDouble *= 100;

        System.out.println(firstDouble);

        double remainder = firstDouble % 40.00;
        System.out.println(remainder);

        boolean myBoolean = (remainder == 0) ? true : false;
        System.out.println(myBoolean);

        if (!myBoolean) {
            System.out.println("Got some remainder");
        }

    }
}
