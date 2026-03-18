package com.sushmit.SystemDesign.LLD.parking_lot.payment;

public class UPIPayment implements Payment {

    @Override
    public boolean pay(double amount) {
        System.out.println("UPI paid: " + amount);
        return true;
    }
}
