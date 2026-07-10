package parkinglot.strategy;

import parkinglot.entity.ParkingLot;
import parkinglot.entity.ParkingSpot;
import parkinglot.entity.Vehicle;

import java.util.Optional;

public interface SpotAssignmentStrategy {
    Optional<ParkingSpot> assignSpot(ParkingLot parkingLot, Vehicle);
}
