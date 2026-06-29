package parkinglot.entity;

import parkinglot.enums.BillStatus;

import java.time.LocalDateTime;

public class Bill {
    private final String billNumber;
    private final Ticket ticket;
    private final LocalDateTime exitTime;
    private final double amount;
    private BillStatus billStatus;

    public Bill(String billNumber, Ticket ticket, double amount) {
        this.billNumber = billNumber;
        this.ticket = ticket;
        this.amount = amount;
        this.exitTime = LocalDateTime.now();
        this.billStatus = BillStatus.GENERATED;
    }

    public void markAsPaid(){
        if(billStatus == BillStatus.PAID)
            throw new IllegalStateException("Bill is already paid");
        if (billStatus == BillStatus.CANCELLED)
            throw new IllegalStateException("Cancelled bill cannot be paid");
        billStatus=BillStatus.PAID;
    }
    public void cancelBill(){
        if(billStatus == BillStatus.CANCELLED)
            throw new IllegalStateException("Bill is already cancelled");
        if(billStatus == BillStatus.PAID)
            throw new IllegalStateException("Paid bill cannot be cancelled");
        billStatus=BillStatus.CANCELLED;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }
}
