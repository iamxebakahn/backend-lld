package parkinglot.entity;

import java.time.LocalDateTime;

public class Ticket {
    private final String ticketNumber;
    private final LocalDateTime entrytime;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;
    private final Gate gate;
    private final Operator operator;

    public Ticket(String ticketNumber, Vehicle vehicle, ParkingSpot parkingSpot, Gate gate, Operator operator) {
        this.ticketNumber = ticketNumber;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.gate = gate;
        this.operator = operator;
        this.entrytime = LocalDateTime.now();
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public LocalDateTime getEntrytime() {
        return entrytime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Gate getGate() {
        return gate;
    }

    public Operator getOperator() {
        return operator;
    }
}
