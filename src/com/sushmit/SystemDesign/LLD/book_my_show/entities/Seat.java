package com.sushmit.SystemDesign.LLD.book_my_show.entities;

import com.sushmit.SystemDesign.LLD.book_my_show.enums.SeatCategory;

public class Seat {
	private final int seatId;
	@SuppressWarnings("unused")
	private final SeatCategory category;
	
	public Seat(int seatId, SeatCategory category) {
		this.seatId = seatId;
		this.category = category;
	}
	
	public int getSeatId() {
		return seatId;
	}
}
