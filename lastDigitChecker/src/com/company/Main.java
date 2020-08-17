package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if((isValid(number1)) &&
                (isValid(number2)) &&
                (isValid(number3))){

            int number1lastDigit = number1%10;
            int number2lastDigit = number2%10;
            int number3lastDigit = number3%10;

            if((number2lastDigit == number1lastDigit) ||
                    (number3lastDigit == number1lastDigit) ||
                    (number3lastDigit == number2lastDigit)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static boolean isValid(int number){
        if((number >= 10) && (number <=1000)){
            return true;
        }else{
            return false;
        }
    }
}
