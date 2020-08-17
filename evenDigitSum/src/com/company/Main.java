package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }

        int digits = number;
        int sum = 0;

        while(digits != 0){
            int digit = digits%10;
            if(digit % 2 == 0){
                sum += digit;
            }
            digits /= 10;
        }
        return sum;
    }
}
