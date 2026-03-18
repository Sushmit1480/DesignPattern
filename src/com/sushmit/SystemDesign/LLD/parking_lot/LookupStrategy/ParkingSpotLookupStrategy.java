package com.sushmit.SystemDesign.LLD.parking_lot.LookupStrategy;

import java.util.List;

import com.sushmit.SystemDesign.LLD.parking_lot.Entity.ParkingSpot;

public interface ParkingSpotLookupStrategy {
    ParkingSpot selectSpot(List<ParkingSpot> spots);
}