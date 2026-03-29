package com.sushmit.SystemDesign.LLD.book_my_show.entities;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public class Booking {
	
	private final UUID bookingId;
	private final User user;
	private final Show show;
	private final List<Integer> seats;
	private final Payment payment;
	
	public Booking(UUID bookingId, User user, Show show, List<Integer> seats, Payment payment) {
		this.bookingId = bookingId;
		this.user = user;
		this.show = show;
		this.seats = seats;
		this.payment = payment;
	}

	public UUID getBookingId() {
		return bookingId;
	}

	public User getUser() {
		return user;
	}

	public Payment getPayment() {
		return payment;
	}
}
