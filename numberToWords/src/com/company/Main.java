package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDigitCount(-123));
    }

    public static void numberToWords (int number){
        if (number < 0){
            System.out.println("Invalid Value");

        } else {
            int lastDigit = number % 10;
            while (lastDigit != 0){
                switch (lastDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Fice");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 10:
                        System.out.println("Ten");
                        break;
                }
                number = number/10;
            }
        }
    }

    public static void reverse (int number){
        int newNumber = 0;
        int lastDigit = number % 10;
        while(lastDigit != 0){
            if(lastDigit % 2 != 0){
                newNumber = newNumber * 10 + lastDigit;
            }
            number = number/10;
        }
    }

    public static int getDigitCount(int number){ // --> Falta caso n negativo, devolver -1
        int numberOfDigits = 0;
        do {
            number = number/10;
            numberOfDigits++;
        } while (number != 0);
        return numberOfDigits;
    }
}
