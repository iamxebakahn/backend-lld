## Schema Design

# ParkingLot
id (PK)
name
status

# ParkingFloor
id (PK)
name
status
parking_lot_id (FK)

# ParkingSpot
id (PK)
number
status
parking_floor_id (FK)

# Gate
id (PK)
name
type
status
parking_lot_id (FK)
operator_id (FK)

# Operator
id (PK)
employee_id
name
phone_number

# Vehicle
id (PK)
registration_number
owner_name
owner_contact
vehicle_type

# Ticket
id (PK)
ticket_number
entry_time
vehicle_id
gate_id
operator_id
parking_spot_id

# Bill
id (PK)
bill_number
ticket_id
exit_time
amount
status

# Payment
id (PK)
reference_number
amount
mode
status
payment_time
bill_id

Due to M:M relationship below tables need to be formed
#  ParkingLotVehicleTypeMap
id
parking_lot_id
vehicle_type

# ParkingFloorVehicleTypeMap
id
parking_floor_id
vehicle_type

# ParkingSpotVehicleTypeMap
id
parking_spot_id
vehicle_type



| Parent       | Child        | Relationship              |
| ------------ | ------------ | ------------------------- |
| ParkingLot   | ParkingFloor | 1:M                       |
| ParkingFloor | ParkingSpot  | 1:M                       |
| ParkingLot   | Gate         | 1:M                       |
| Gate         | Operator     | 1:1 (for this assignment) |
| Ticket       | Vehicle      | 1:1                       |
| Bill         | Ticket       | 1:1                       |
| Bill         | Payment      | 1:M                       |
| ParkingLot   | VehicleType  | M:M                       |
| ParkingFloor | VehicleType  | M:M                       |
| ParkingSpot  | VehicleType  | M:M                       |
