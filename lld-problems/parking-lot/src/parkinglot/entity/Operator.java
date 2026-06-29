package parkinglot.entity;

public class Operator {
    private final String employeeId;
    private final String name;
    private final String phoneNumber;

    public Operator(String employeeId, String name, String phoneNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
