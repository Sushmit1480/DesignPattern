package com.sushmit.SystemDesign.LLD.parking_lot.parkinglot;

import com.sushmit.SystemDesign.LLD.parking_lot.Ticket;
import com.sushmit.SystemDesign.LLD.parking_lot.Entity.Vehicle;

public class EntranceGate {

    public Ticket enter(ParkingBuilding building, Vehicle vehicle) {
        return building.allocate(vehicle);
    }
}

