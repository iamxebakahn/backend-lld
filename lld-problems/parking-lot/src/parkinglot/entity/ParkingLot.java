package parkinglot.entity;

import parkinglot.enums.ParkingLotStatus;
import parkinglot.enums.VehicleType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParkingLot {
    private final String parkingLotNumber;
    private final String name;
    private ParkingLotStatus parkingLotStatus;
    private final List<ParkingFloor> parkingFloors;
    private final List<Gate> gates;
    private final List<VehicleType> supportedVehicleTypes;

    public ParkingLot(String parkingLotNumber, String name, List<VehicleType> supportedVehicleTypes) {
        if (parkingLotNumber == null || parkingLotNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Parking lot number cannot be null or blank."
            );
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Parking lot name cannot be null or blank."
            );
        }

        if (supportedVehicleTypes == null || supportedVehicleTypes.isEmpty()) {
            throw new IllegalArgumentException(
                    "Supported vehicle types cannot be null or empty."
            );
        }
        this.parkingLotNumber = parkingLotNumber;
        this.name = name;
        this.supportedVehicleTypes = new ArrayList<>(supportedVehicleTypes);
        this.parkingLotStatus = ParkingLotStatus.OPEN;
        this.parkingFloors = new ArrayList<>();
        this.gates = new ArrayList<>();
    }

    public boolean isOpen(){
        return parkingLotStatus == ParkingLotStatus.OPEN;
    }
    public void openParkingLot(){
        if(isOpen())
            throw new IllegalStateException("Parking Lot is already open");
        parkingLotStatus=ParkingLotStatus.OPEN;
    }

    public void closeParkingLot(){
        if(!isOpen())
            throw new IllegalStateException("Parking Lot is already closed");
        parkingLotStatus=ParkingLotStatus.CLOSED;
    }

    public void addParkingFloor(ParkingFloor parkingFloor){
        if(parkingFloor==null)
            throw new IllegalStateException("ParkingFloor cannot be null");
        parkingFloors.add(parkingFloor);
    }

    public void addGate(Gate gate){
        if(gate==null)
            throw new IllegalStateException("Gate cannot be null");
        gates.add(gate);
    }

    public String getParkingLotNumber() {
        return parkingLotNumber;
    }

    public String getName() {
        return name;
    }

    public List<Gate> getGates() {
        return Collections.unmodifiableList(gates);
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return Collections.unmodifiableList(supportedVehicleTypes);
    }

    public List<ParkingFloor> getParkingFloors() {
        return Collections.unmodifiableList(parkingFloors);
    }
}
