package com.company;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account(123456, 500, "Pablo H.", "qrwqer@qwrqw.com", 621621621);

        account1.getBalance();
        account1.withdrawFunds(600);
        account1.withdrawFunds(400);
        account1.getBalance();

        VipCustomer vipCustomer1 = new VipCustomer("Rico1", "rico1@gmail.com");
        VipCustomer vipCustomer2 = new VipCustomer("Rico2", 10000, "rico1@gmail.com");

        System.out.println(vipCustomer1.toString());
    }
}
