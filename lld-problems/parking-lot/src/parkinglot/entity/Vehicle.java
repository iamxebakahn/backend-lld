package parkinglot.entity;

import parkinglot.enums.VehicleType;

public class Vehicle {
    private final String registrationNumber;
    private final String ownerName;
    private final String ownerContact;
    private final VehicleType vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String ownerContact, VehicleType vehicleType)
        if(registrationNumber == null || registrationNumber.isBlank())
            throw new IllegalStateException("Registration number cannot be blank or null");

        if(ownerName == null || ownerName.isBlank())
            throw new IllegalStateException("Owner name cannot be null or blank");

        if(ownerContact == null || ownerContact.isBlank())
            throw new IllegalStateException("Owner contact cannot be null or blank");

        if(vehicleType == null)
            throw new IllegalStateException("Vehicle type cannot be null");

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
