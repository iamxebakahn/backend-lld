# Class Diagram

## Entity Classes
ParkingLot
ParkingFloor
ParkingSpot
Vehicle
Gate
Operator
Ticket
Bill
Payment

## Enum Classes
Vehicle Type
Gate Type
ParkingLotStatus
FloorStatus
SpotStatus
PaymentMode
PaymentStatus
BillStatus

class ParkingLot{
String name;
ParkingLotStatus status;
List<ParkingFloor> floors;
List<Gate> gates;
List<VehicleType> supportedVehicleTypes;
}

class ParkingFloor{
String name;
FloorStatus status;
List<ParkingSpot> parkingSpots;
List<VehicleType> supportedVehicleTypes;
}

class ParkingSpot{
String name;
SpotStatus status;
List<VehicleType> supportedVehicleTypes;
}

class Vehicle{
String registrationNumber;
String ownerName;
String ownerContact;
VehicleType vehicleType;
}

class Operator{
String name;
String phoneNumber;
String employeeId;
}

class Gate{
String name;
GateType gateType;
GateStatus status;
Operator operator;
}

class Ticket{
String number;
DateTime entryTime;
Vehicle vehicle;
Gate gate;
Operator operator;
ParkingSpot parkingspot;
}

class Bill{
String number;
Ticket ticket;
Datetime exitTime;
Integer amount;
BillStatus status;
List<Payment> payments;
}

class Payment{
String referenceNumber;
Integer amount;
PaymentMode mode;
PaymentStatus status;
DateTime paymentTime;
}


## Design Notes
Vehicle Type is modelled as Enum
GateType is modelled as Enum
ParkingLot contains Floors
Ticket acts as proof of parking
Bill is generated from Ticket
Multiple Payments are supported for a Bill
