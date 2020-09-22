package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(1010);
    }

    public static void numberToWords (int number){
        int digitsInit = getDigitCount(number);
        int digitsEnd = 0;

        if (number < 0){
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {
            switch (reverseNumber % 10){
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
                default:
                    break;
            }
            reverseNumber /= 10;
        }
        System.out.println();
    }

    public static int reverse (int number){
        int newNumber = 0;
        while(number != 0){
            int lastDigit = number % 10;
            newNumber = newNumber * 10 + lastDigit;
            number = number/10;
        }
        return newNumber;
    }

    public static int getDigitCount(int number){
        int numberOfDigits = 0;
        if(number < -1){
            return -1;
        }else {
            do {
                number = number/10;
                numberOfDigits++;
            } while (number != 0);
            return numberOfDigits;
        }

    }
}
