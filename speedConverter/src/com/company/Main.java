package com.company;

public class Main {

    public static void main(String[] args) {
        printConversion(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        double milesPerHour;
        if (kilometersPerHour >= 0){
            milesPerHour = Math.round((kilometersPerHour / 1.609));
        } else {
            milesPerHour = -1;
        } return (long) milesPerHour;
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour >= 0){
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        } else{
            System.out.println("Invalid Value");
        }
    }
}
