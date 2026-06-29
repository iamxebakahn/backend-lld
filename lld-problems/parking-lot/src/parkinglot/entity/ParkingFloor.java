package parkinglot.entity;

import parkinglot.enums.FloorStatus;
import parkinglot.enums.VehicleType;

import java.util.List;

public class ParkingFloor {
    private final String floorNumber;
    private FloorStatus floorStatus;
    private final List<ParkingSpot> parkingSpots;
    private final List<VehicleType> supportedvehicleTypes;

    public ParkingFloor(String floorNumber, List<ParkingSpot> parkingSpots, List<VehicleType> supportedvehicleTypes) {
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
        this.supportedvehicleTypes = supportedvehicleTypes;
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
        parkingSpots.add(parkingSpot);
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public List<VehicleType> getSupportedvehicleTypes() {
        return supportedvehicleTypes;
    }
}
