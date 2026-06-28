package parkinglot.entity;

import java.time.LocalDateTime;

public class Ticket {
    private String ticketNumber;
    private LocalDateTime entrytime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Gate gate;
    private Operator operator;

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
