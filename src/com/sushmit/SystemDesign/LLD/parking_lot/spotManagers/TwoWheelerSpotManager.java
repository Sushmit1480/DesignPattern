package com.sushmit.SystemDesign.LLD.parking_lot.spotManagers;

import java.util.List;

import com.sushmit.SystemDesign.LLD.parking_lot.Entity.ParkingSpot;
import com.sushmit.SystemDesign.LLD.parking_lot.LookupStrategy.ParkingSpotLookupStrategy;

public class TwoWheelerSpotManager extends ParkingSpotManager {

    /*
     1. Maintains a list of Two Wheeler Spots only
     2. Has its own lookup strategy
     3. Has its own lock, to avoid conflicts with other spot managers
     */
    public  TwoWheelerSpotManager(List<ParkingSpot> spots, ParkingSpotLookupStrategy strategy) {
        super(spots, strategy);
    }
}
