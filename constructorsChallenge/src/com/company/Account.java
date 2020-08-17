package com.company;

public class Account {
    private int accNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public Account(int accNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void getBalance() {
        System.out.println(balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        setBalance(this.balance + depositAmount);
    }

    public void withdrawFunds(double withdrawAmount){
        if(this.balance < withdrawAmount){
            System.out.println("Insufficient funds.");
        } else{
            setBalance(this.balance - withdrawAmount);
        }
    }
}
