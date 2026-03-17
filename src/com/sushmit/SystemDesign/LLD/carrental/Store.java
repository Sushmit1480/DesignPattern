package com.sushmit.SystemDesign.LLD.carrental;

import java.time.LocalDate;
import java.util.List;

import com.sushmit.SystemDesign.LLD.carrental.Bill.Bill;
import com.sushmit.SystemDesign.LLD.carrental.Bill.BillManager;
import com.sushmit.SystemDesign.LLD.carrental.Bill.BillingStrategy;
import com.sushmit.SystemDesign.LLD.carrental.Bill.DailyBillingStrategy;
import com.sushmit.SystemDesign.LLD.carrental.payment.Payment;
import com.sushmit.SystemDesign.LLD.carrental.payment.PaymentManager;
import com.sushmit.SystemDesign.LLD.carrental.payment.PaymentStrategy;
import com.sushmit.SystemDesign.LLD.carrental.payment.UPIPaymentStrategy;
import com.sushmit.SystemDesign.LLD.carrental.product.Vehicle;
import com.sushmit.SystemDesign.LLD.carrental.product.VehicleInventoryManager;
import com.sushmit.SystemDesign.LLD.carrental.product.VehicleType;
import com.sushmit.SystemDesign.LLD.carrental.reservation.Reservation;
import com.sushmit.SystemDesign.LLD.carrental.reservation.ReservationManager;
import com.sushmit.SystemDesign.LLD.carrental.reservation.ReservationType;

public class Store {

    private final int storeId;
    @SuppressWarnings("unused")
	private final Location storeLocation;
    private final VehicleInventoryManager inventory;
    private final ReservationManager reservationManager;

    private final BillManager billManager;
    private final PaymentManager paymentManager;

    public Store(int storeId, Location location) {

        this.storeId = storeId;
        this.storeLocation = location;
        this.inventory = new VehicleInventoryManager();
        this.billManager = new BillManager(new DailyBillingStrategy(inventory)); //default
        this.paymentManager = new PaymentManager(new UPIPaymentStrategy()); //default
        this.reservationManager = new ReservationManager(inventory);
    }

    // ----------------- Search Vehicles --------------------

    public List<Vehicle> getVehicles(VehicleType type, LocalDate from, LocalDate to) {
        return inventory.getAvailableVehicles(type, from, to);
    }

    // ----------------- Create Reservation -----------------
    public Reservation createReservation(int vehicleId, User user, LocalDate from, LocalDate to,
                                         ReservationType type) throws Exception {
        return reservationManager.createReservation(vehicleId, user, from, to, type);
    }

    // ----------------- Update Reservation -----------------

    public void cancelReservation(int reservationId) {
        reservationManager.cancelReservation(reservationId);
    }

    public void startTrip(int reservationId) {
        reservationManager.startTrip(reservationId);
    }

    public void submitVehicle(int reservationId) {
        reservationManager.submitVehicle(reservationId);
    }

    // ----------------- Billing & Payment ------------------

    public Bill generateBill(int reservationId, BillingStrategy billingStrategy) {
        Reservation r = reservationManager.findByID(reservationId)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));

        billManager.setBillingStrategy(billingStrategy);
        return billManager.generateBill(r);
    }

    public Payment makePayment(Bill bill, PaymentStrategy paymentStrategy, double paymentAmount) {

        paymentManager.setPaymentStrategy(paymentStrategy);
        Payment payment = paymentManager.makePayment(bill, paymentAmount);

        if (!bill.isBillPaid()) {
            throw new RuntimeException("Payment failed");
        }

        // NOW we can safely remove the reservation from the repo
        reservationManager.remove(bill.getReservationId());
        return payment;
    }


    public VehicleInventoryManager getInventory() {
        return inventory;
    }

    public int getStoreId() {
        return storeId;
    }
}
