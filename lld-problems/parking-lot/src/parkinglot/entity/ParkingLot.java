package parkinglot.entity;

import parkinglot.enums.ParkingLotStatus;
import parkinglot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String parkingLotNumber;
    private String name;
    private ParkingLotStatus parkingLotStatus;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<VehicleType> supportedVehicleTypes;

    public ParkingLot(String parkingLotNumber, String name, List<VehicleType> supportedVehicleTypes) {
        this.parkingLotNumber = parkingLotNumber;
        this.name = name;
        this.supportedVehicleTypes = supportedVehicleTypes;
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
        return gates;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }
}
