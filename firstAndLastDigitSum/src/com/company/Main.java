package com.company;

public class Main {

    public static void main(String[] args) {

        int number1 = 123456;

        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }else{
            int lastDigit = number % 10;
            while (number >= 10){
                number /= 10;
            }
            int firstDigit = number%10;
            return lastDigit + firstDigit;
        }
    }
}
