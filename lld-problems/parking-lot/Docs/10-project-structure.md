# Project Structure

The project is organized by responsibility rather than by feature. Each package has a single responsibility, making the code easier to understand and maintain.

Client Layer 
    |
Service Layer
    |
Strategy Layer
    |
Repository Layer
    |
Entity Layer

client contains Main.java

entity contains:
ParkingLot
ParkingFloor
ParkingSpot
Vehicle
Gate
Operator
Ticket
Bill
Payment

enum contains:
VehicleType
GateType
SpotStatus
FloorStatus
ParkingLotStatus
PaymentStatus
BillStatus
PaymentMode

Repository:
ParkingLotRepository
TicketRepository
VehicleRepository
BillRepository

Service:
TicketService
BillService
PaymentService
ParkingLotService

Strategy:
SpotAssignmentStrategy
NearestSpotStrategy
RandomSpotStrategy
FirstAvailableStrategy

PaymentStrategy
CashPaymentStrategy
CardPaymentStrategy
UPIPaymentStrategy

Factory:
Vehicle Factory

Exception:
SpotNotAvailableException
InvalidTicketException
PaymentFailedException

util:
IdGenerator
DateTimeUtil

# Implementation Order
Enums -> Entities -> Repositories -> Strategies -> Services -> Client -> Testing (Entry, Exit, Payment, Refund)

Package	            Responsibility
entity	            Business objects
enums	            Fixed constants
strategy	        Replaceable algorithms
repository	        Data storage
service	            Business logic
client	            Driver program
factory	            Object creation
exception	        Error handling
util	            Helper classes


# Class Dependency Diagram
Main -> ParkingLotService -> TicketService -> SpotAssignmentStrategy -> ParkingSpot -> Ticket -> BillService -> PaymentService