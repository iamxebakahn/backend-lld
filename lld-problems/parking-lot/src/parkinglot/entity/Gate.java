package parkinglot.entity;

public class Gate {
    private String employeeId;
    private String name;
    private String phoneNumber;

    public Gate(String employeeId, String name, String phoneNumber) {
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
