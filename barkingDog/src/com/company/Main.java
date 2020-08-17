package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (barking == true && ((hourOfDay < 8) || (hourOfDay > 22)) && (hourOfDay >= 0) && (hourOfDay <= 23)){
            return true;
        } else if (barking == false && (hourOfDay < 0) || (hourOfDay > 23) || (hourOfDay >= 8) || (hourOfDay < 22)){
            return false;
        } return false;
    }

}

