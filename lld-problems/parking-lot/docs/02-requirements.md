1. Parking Lot can have multiple floors
2. Each floor can have multiple parking slots
3. Parking spots can support multiple vehicle types
4. Parking lot contains entry and exit gates
5. Vehicle receives ticket at entry
6. Parking spot maybe assigned during entry or customer can look a spot for their vehicle at the entry
7. Gate operator is present at gates to access the system
8. Bill is generated at the exit
9. Parking fee is calculated using the ticket
10. Multiple payments are allowed for a ticket(part in cash and part in upi/card)
11. Payments are supported by 3rd party app
13. Refunds are supported

## Payment Requirements 
1. Payments can be accepted in cash/upi/card

## Ticket Requirements
1. Entry Time
2. Parking Lot Details
3. Vehicle Details
4. Operator

## Bill Requirements
1. Bill Number
2. Ticket Details
2. Exit Time
3. Duration 
4. Amount
5. Operator Details

## Non Functional Requirements
Extensible:
1. Easy to add vehicles
Readability:
2. Easy to read
Maintainable:
3. Separate Responsibilities
Testable:
4. Testable business logics

## Assumptions
1. There's only 1 parking lot
2. No database
3. No authentication
4. No concurrency handling



