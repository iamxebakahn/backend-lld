# Entity Identification

An entity is an object that:

- Has its own identity
- Has its own state
- Exists independently in the system
- Participates in business operations

## ParkingLot
Entire system revolves around parking lot
It has:
-floors
-gates
-vehicle types

## ParkingFloor
It has parking spots.
Floor can be:
-available
-full
-closed

## Parking Spot
-Parking spot supports various vehicle types
-It can have different statuses

## Vehicle
Every vehicle has:
-Registration Number
-Owner Information
-Vehicle Type

## Gate
Gate has:
-Type
-Operator
-Status

## Operator
Operator generates:
-tickets
-bills
Operator manages entry/exits operations

## Ticket
Generated during entry
Ticket has:
-Entry Time
-Vehicle Details
-Operator Details
-Gate Details

## Bill
Generate during exit
Bill has:
-Ticket Details
-End Time
-Duration
-Amount
-Bill Number

## Payment
Multiple payments can be present in a bill
It has:
-amount
-mode
-status

## Potential Enums
Vehicle Type
Gate Type
Spot Status
Floor Status
Parking Lot Status
Payment Status
Bill Status
Payment Mode
