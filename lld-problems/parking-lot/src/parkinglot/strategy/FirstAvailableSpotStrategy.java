package parkinglot.strategy;

import parkinglot.entity.ParkingFloor;
import parkinglot.entity.ParkingLot;
import parkinglot.entity.ParkingSpot;

public class FirstAvailableSpotStrategy implements SpotAssignmentStrategy {
    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot) {
        for(ParkingFloor floor: parkingLot.getParkingFloors()){
            for(ParkingSpot spot: floor.getParkingSpots()){
                if(spot.isAvailable() && spot.getSupportedVehicleTypes())
                    return spot;
            }
        }
        return null;
    }
}
