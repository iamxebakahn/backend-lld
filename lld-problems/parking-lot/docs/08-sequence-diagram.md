# Sequence Diagram
Colllaboration of objects to perform business operations. Instead of focusing on object structure, they focus on object interaction.

## Vehicle Entry Flow and Interaction
Driver
    |
Entry Gate
    |
Operator
    |
Ticket Service
    |
Spot Assignment Strategy
    |
Find available Parking Spot
    |
Parking Spot
    |
Reserve Spot
    |
Ticket Service
    |
Create Ticket
    |
Vehicle Parks


## Responsibilities
Object	                    Responsibility
Entry Gate          	    Accept vehicle
Operator	                Initiate ticket generation
TicketService   	        Create ticket
SpotAssignmentStrategy	    Choose parking spot
ParkingSpot             	Reserve itself


## Vehicle Exit Flow and Interaction
Driver
    |
Exit Gate
    |
Operator
    |
Retrieve Ticket
    |
Bill Service
    |
Calculate Duration
    |
Calculate Amount
    |
Generate Bill
    |
Display Bill
    |
Payment Service
    |
Payment Successful
    |
Release Parking Spot
    |
Exit Vehicle


## Payment Flow and Interaction
Driver
    |
Chose Payment Mode
    |
Payment Service
    |
Payment Strategy
    |
Execute Payment
    |
Create Payment
    |
Update Bill
    |
Return Success

## Refund Flow and Interaction
Driver 
    |
Operator
    |
Payment Service
    |
Validate Refund
    |
Create Refund Payment
    |
Create Refund Payment
    |
Update Bill
    |
Return Success


## Services Discovered
Service	                Responsibility
TicketService	        Create ticket
BillService         	Generate bill
PaymentService      	Handle payment
SpotAssignmentStrategy	Assign spot


## Observations
Entities store state.
Services perform business operations.
Strategies encapsulate interchangeable algorithms.
Gates coordinate entry and exit but do not contain business logic.
Ticket acts as the source of truth for parking duration.
