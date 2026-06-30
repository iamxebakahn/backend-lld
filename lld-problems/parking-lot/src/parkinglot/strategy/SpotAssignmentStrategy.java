package parkinglot.strategy;

import parkinglot.entity.ParkingLot;
import parkinglot.entity.ParkingSpot;
import parkinglot.entity.Vehicle;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot, Vehicle);
}
