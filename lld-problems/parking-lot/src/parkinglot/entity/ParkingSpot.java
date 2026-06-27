package parkinglot.entity;

import parkinglot.enums.SpotStatus;
import parkinglot.enums.VehicleType;

import java.util.List;

public class ParkingSpot {
    private String spotNumber;
    private SpotStatus status;
    private List<VehicleType> supportedVehicleTypes;

    public ParkingSpot(String spotNumber, List<VehicleType> supportedVehicleTypes) {
        this.spotNumber = spotNumber;
        this.supportedVehicleTypes = supportedVehicleTypes;
        this.status = SpotStatus.AVAILABLE;
    }

    public boolean isAvailable(){
        return status == SpotStatus.AVAILABLE;
    }
    public void occupy(){
        if(!isAvailable())
            throw new IllegalStateException("Parking spoy is already occupied")
        this. status = SpotStatus.OCCUPIED;
    }
    public void release(){
        if(isAvailable())
            throw new IllegalStateException("Parking Spot is already available")
        this.status = SpotStatus.AVAILABLE;
    }

    public String getSpotNumber() {
        return spotNumber;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }
}
