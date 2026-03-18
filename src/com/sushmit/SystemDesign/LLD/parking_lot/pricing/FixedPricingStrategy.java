package com.sushmit.SystemDesign.LLD.parking_lot.pricing;

import com.sushmit.SystemDesign.LLD.parking_lot.Ticket;

public class FixedPricingStrategy implements PricingStrategy {

    @Override
    public double calculate(Ticket ticket) {
        return 100;
    }
}
