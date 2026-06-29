package parkinglot.entity;

import parkinglot.enums.VehicleType;

public class Vehicle {
    private final String registrationNumber;
    private final String ownerName;
    private final String ownerContact;
    private final VehicleType vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String ownerContact, VehicleType vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.ownerContact = ownerContact;
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
