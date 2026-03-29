package com.sushmit.SystemDesign.LLD.book_my_show.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.sushmit.SystemDesign.LLD.book_my_show.entities.Booking;
import com.sushmit.SystemDesign.LLD.book_my_show.entities.Payment;
import com.sushmit.SystemDesign.LLD.book_my_show.entities.Show;
import com.sushmit.SystemDesign.LLD.book_my_show.entities.User;
import com.sushmit.SystemDesign.LLD.book_my_show.enums.PaymentStatus;

public class BookingService {

    private final Map<UUID, Booking> bookings = new HashMap<>();


    public Booking book(User user, Show show, List<Integer> seats) {

        if (!show.lockSeats(seats)) {
            throw new RuntimeException("Seat unavailable");
        }

        //simulated payment flow here, we can invoke Pay method of Payment Controller
        Payment payment = new Payment(PaymentStatus.SUCCESS);

        if (payment.getStatus() == PaymentStatus.SUCCESS) {
            show.confirmSeats(seats);
            UUID bookingId = UUID.randomUUID();
            Booking booking =  new Booking(bookingId,user, show, seats, payment);
            bookings.put(booking.getBookingId(), booking);
            return booking;
        } else {
            show.releaseSeats(seats);
            throw new RuntimeException("Payment failed");
        }
    }

    public Booking getBooking(UUID bookingId) {
        return bookings.get(bookingId);
    }

    public List<Booking> getBookingsForUser(User user) {
        return bookings.values()
                .stream()
                .filter(b -> b.getUser().equals(user))
                .toList();
    }
}
