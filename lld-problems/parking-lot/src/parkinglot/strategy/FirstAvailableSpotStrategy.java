package parkinglot.strategy;

import parkinglot.entity.ParkingFloor;
import parkinglot.entity.ParkingLot;
import parkinglot.entity.ParkingSpot;
import parkinglot.entity.Vehicle;

public class FirstAvailableSpotStrategy implements SpotAssignmentStrategy {
    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, Vehicle vehicle) {
        for(ParkingFloor floor: parkingLot.getParkingFloors()){
            for(ParkingSpot spot: floor.getParkingSpots()){
                if(spot.isAvailable() && spot.supportsVehicle(vehicle.getVehicleType()))
                    return spot;
            }
        }
        return null;
    }
}
