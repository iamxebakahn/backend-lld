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
        this. status = SpotStatus.OCCUPIED;
    }
    public void release(){
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
