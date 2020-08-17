package com.company;

public class VipCustomer {
    private String name;
    double creditLimit;
    String vipEmail;

    public VipCustomer() {
    }

    public VipCustomer(String name, String vipEmail) {
        this.name = name;
        this.creditLimit = 3000;
        this.vipEmail = vipEmail;
    }

    public VipCustomer(String name, double creditLimit, String vipEmail) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.vipEmail = vipEmail;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getVipEmail() {
        return vipEmail;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", vipEmail='" + vipEmail + '\'' +
                '}';
    }
}
