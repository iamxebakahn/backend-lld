package parkinglot.entity;

public class Operator {
    private final String employeeId;
    private final String name;
    private final String phoneNumber;

    public Operator(String employeeId, String name, String phoneNumber) {
        if(employeeId ==null || employeeId.isBlank())
            throw new IllegalStateException("Employee ID cannot be blank or null");
        if(name == null || name.isBlank())
            throw new IllegalStateException("Operator name cannot be blank or null");
        if(phoneNumber == null || phoneNumber.isBlank())
            throw new IllegalStateException("Phone number cannot be blank or null");
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
