# Relationships Identification

Parking Lot (1)----(M) Parking Floor
Parking Floor (1)----(M) Parking Spot
Parking Lot(1)----(M) Gate
Gate(1)----(1) Operator
Ticket(1)----(1) Vehicle
Ticket(M)----(1) Gate
Ticket(M)----(1) Operator
Ticket(M)----(1) Parking Spot
Bill(1)----(1) Ticket
Payment(M)----(1) Bill
ParkingLot(M)----(M) Vehicle Type
Parking Floor(M)----(M) Vehicle Type
Parking Spot(M)----(M) Vehicle Type

