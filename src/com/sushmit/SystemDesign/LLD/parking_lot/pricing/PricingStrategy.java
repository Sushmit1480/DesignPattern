package com.sushmit.SystemDesign.LLD.parking_lot.pricing;

import com.sushmit.SystemDesign.LLD.parking_lot.Ticket;

public interface PricingStrategy {
	double calculate(Ticket ticket);
}
