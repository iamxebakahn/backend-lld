package parkinglot.entity;

import parkinglot.enums.FloorStatus;
import parkinglot.enums.VehicleType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParkingFloor {
    private final String floorNumber;
    private FloorStatus floorStatus;
    private final List<ParkingSpot> parkingSpots;
    private final List<VehicleType> supportedVehicleTypes;

    public ParkingFloor(String floorNumber, List<VehicleType> supportedVehicleTypes) {
        if (floorNumber == null || floorNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Floor number cannot be null or blank."
            );
        }

        if (supportedVehicleTypes == null || supportedVehicleTypes.isEmpty()) {
            throw new IllegalArgumentException(
                    "Supported vehicle types cannot be null or empty."
            );
        }
        this.floorNumber = floorNumber;
        this.supportedVehicleTypes = new ArrayList<>(supportedVehicleTypes);
        this.parkingSpots = new ArrayList<>();
        this.floorStatus = FloorStatus.OPEN;
    }

    public boolean isOpen(){
        return floorStatus = FloorStatus.OPEN;
    }
    public void openFloor(){
        if(isOpen())
            throw new IllegalStateException("Floor is already open");
        floorStatus=FloorStatus.OPEN;
    }

    public void closeFloor(){
        if(!isOpen())
            throw new IllegalStateException("Floor is already closed");
        floorStatus=FloorStatus.CLOSED;
    }
    public void addParkingSpot(ParkingSpot parkingSpot){
        if (parkingSpot == null) {
            throw new IllegalArgumentException(
                    "Parking spot cannot be null."
            );
        }
        parkingSpots.add(parkingSpot);
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public List<ParkingSpot> getParkingSpots() {
        return Collections.unmodifiableList(parkingSpots);
    }

    public List<VehicleType> getSupportedvehicleTypes() {
        return Collections.unmodifiableList(supportedvehicleTypes);
    }
}
