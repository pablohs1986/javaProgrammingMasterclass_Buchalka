package com.company;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);

    }

    public static void printMegaBytesAndKiloBytes(int kyloBytes){
        int megaBytes = kyloBytes * 1024;
        int remaining;

        System.out.println(megaBytes);
    }
}
