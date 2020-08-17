package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 123321;

        System.out.println(isPalindrome(number));

    }

    public static boolean isPalindrome(int number){
        int reverseNumber = 0;
        int digits = number;

        while(digits != 0){
            int digit = digits % 10;
            reverseNumber = reverseNumber * 10 + digit;
            digits /= 10;
        }
        System.out.println(reverseNumber);
        System.out.println(number);
        if(number == reverseNumber){
            return true;
        }else{
            return false;
        }
    }
}
