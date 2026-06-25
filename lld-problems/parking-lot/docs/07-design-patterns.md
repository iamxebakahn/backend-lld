# Design Pattern

Identifying in Parking Lot Management Systems why a particular design pattern is suitable. 
Objective: Make system extensible without modifying existing code

## Future Changes
New Vehicle Type - Highly probable
New Spot Allocation Algorithm - Highly probable
New Payment Modes - Highly probable 
New Pricing Rules - Highly probable
Multiple Parking Lots - Highly probable
Ticket Generation Logic - Can change
Operator Logic - Rarely changed

## Parking Spot Assignment
-Nearest Spot
Tomorrow can be:
FCFS
Random Spot
EV Preferred
VIP Spot
Handicap Spot
Truck Zone

## Strategy Pattern
Parking Spot allocation algorithms can change over time, therefore SpotAssignmentStrategy Interface

Concrete Strategies:
-NearestSpotStrategy
-FirstAvailableSpotStrategy
-RandomSpotStrategy
-EVPrioritySpotStrategy

## Payment Strategy
Today:
Cash, Card, UPI

## Tomorrow can be:
Wallet
Net Banking
Corporate Credit

## Strategy Pattern
Payment Processing
Create Payment Strategy
Concrete Implementations
CashPaymentStrategy
CardPaymentStrategy
UPIPaymentStrategy

Why Strategy?
Parking spot allocation is expected to change as new business rules are introduced (EV parking, VIP parking, nearest available, etc.). Using Strategy keeps the allocation logic open for extension while avoiding changes to existing code.

## Factory Pattern
Vehicle Factory creates car,bike,truck
In future may create electriccar,bus,emergencyVehicle

## Observer Pattern as a future enhancement
Parking Lot display board - with information on available spots for cars,bikes,trucks
Subsribers can get information on some policy related changes

## Builder Pattern
Ticket and Bill object creation can be better handled with builder pattern
Bill has : tax, discount, coupon, payments, duration, fine, GST, operator, ticket, exitTime

## Not using below patterns
Adapter: no external incompatible API yet
Decorator: no dynamic feature composition
Flyweight: object count is still manageable
Prototype: no doning requirement
