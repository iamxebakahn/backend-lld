# Parking Lot Visualization

## Physical Structure

|- Floor 1
| |- Spot 1
| |- Spot 2
| |- Spot 3
|
|- Floor 2
| |- Spot 1
| |- Spot 2
| |- Spot 3
|
|- Entry Gate 2
|- Entry Gate 1
|
|- Exit Gate 1
|- Exit Gate 2

Parking lot can have multiple floors
Each floor contains multiple parking spots
Parking lot also contains multiple entry and exit gates
Vehicles enter through entry gates and leave through exit gates

## User Journey
Vehicle Arrrives
        |
Entry Gate
        |
Ticket Generation
        |
Parking Spot assigned/ Parking Spot found by self
        |
Vehicle Parked
        |
Vehicle wants to exit 
        |
Bill Generated
        |
Payment Done
        |
Vehicle Leaves

## Objects Observed During Visualization
Parking Lot
Parking Floor
Parking Spot
Vehicle
Gate
Operator
Ticket
Bill
Payment

## Relationships Observed
Parking Lot contains Floors
Floor contains Parking Spots
Gate has operator
Vehicle recieves ticket
Ticket generates bill
Bill contains payment
