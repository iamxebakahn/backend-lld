package parkinglot.entity;

import parkinglot.enums.SpotStatus;
import parkinglot.enums.VehicleType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParkingSpot {
    private final String spotNumber;
    private SpotStatus status;
    private final List<VehicleType> supportedVehicleTypes;

    public ParkingSpot(String spotNumber, List<VehicleType> supportedVehicleTypes) {
        if(spotNumber == null || spotNumber.isBlank())
            throw new IllegalStateException("Spot number cannot be null or blank");
        if(supportedVehicleTypes == null || supportedVehicleTypes.isEmpty())
            throw new IllegalStateException("Supported vehicle types cannot be null or empty");
        this.spotNumber = spotNumber;
        this.supportedVehicleTypes = new ArrayList<>(supportedVehicleTypes);
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
        return Collections.unmodifiableList(supportedVehicleTypes);
    }
}
