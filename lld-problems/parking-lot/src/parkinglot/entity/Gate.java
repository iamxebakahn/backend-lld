package parkinglot.entity;

import parkinglot.enums.GateStatus;
import parkinglot.enums.GateType;

public class Gate {
    private final String gateNumber;
    private final GateType gateType;
    private final Operator operator;
    private GateStatus gateStatus;

    public Gate(String gateNumber, GateType gateType, Operator operator) {
        if (gateNumber == null || gateNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Gate number cannot be null or blank."
            );
        }

        if (gateType == null) {
            throw new IllegalArgumentException(
                    "Gate type cannot be null."
            );
        }

        if (operator == null) {
            throw new IllegalArgumentException(
                    "Operator cannot be null."
            );
        }
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.operator = operator;
        this.gateStatus=GateStatus.OPEN;
    }

    public Operator getOperator() {
        return operator;
    }

    public GateType getGateType() {
        return gateType;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public boolean isOpen(){
        return gateStatus == GateStatus.OPEN;
    }

    public void openGate(){
        if(isOpen())
            throw new IllegalStateException("Gate is already open");
        gateStatus = GateStatus.OPEN;
    }

    public void closeGate(){
        if(!isOpen())
            throw new IllegalStateException("Gate is already closed");
        gateStatus = GateStatus.CLOSED;
    }
}
