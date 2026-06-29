package parkinglot.entity;

import parkinglot.enums.PaymentMode;
import parkinglot.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment {
    private final String paymentId;
    private final Bill bill;
    private final double amount;
    private final LocalDateTime paymentTime;
    private PaymentStatus paymentStatus;
    private final PaymentMode paymentMode;

    public Payment(String paymentId, Bill bill, double amount, PaymentMode paymentMode) {
        this.paymentId = paymentId;
        this.bill = bill;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.paymentTime = LocalDateTime.now();
        this.paymentStatus = PaymentStatus.PENDING;
    }

    public void markSuccessful(){
        if(paymentStatus == PaymentStatus.SUCCESS)
            throw new IllegalStateException("Payment already successful");
        if(paymentStatus == PaymentStatus.FAILED)
            throw new IllegalStateException("Failed payment cannot become successful. Create a new payment");
        paymentStatus=PaymentStatus.SUCCESS;
    }
    public void markFailed(){
        if(paymentStatus == PaymentStatus.FAILED)
            throw new IllegalStateException("Payment already failed");
        if (paymentStatus == PaymentStatus.SUCCESS)
            throw new IllegalStateException("Successful payment cannot fail");
        paymentStatus = PaymentStatus.FAILED;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public Bill getBill() {
        return bill;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }
}
