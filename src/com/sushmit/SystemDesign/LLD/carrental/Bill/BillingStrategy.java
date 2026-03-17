package com.sushmit.SystemDesign.LLD.carrental.Bill;

import com.sushmit.SystemDesign.LLD.carrental.reservation.Reservation;

public interface BillingStrategy {
	Bill generateBill(Reservation reservation);
}
