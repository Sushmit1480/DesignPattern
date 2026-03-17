package com.sushmit.SystemDesign.LLD.carrental.payment;

import com.sushmit.SystemDesign.LLD.carrental.Bill.Bill;

public interface PaymentStrategy {
    Payment processPayment(Bill bill, double paymentAmount);
}


