package parkinglot.repository;
import parkinglot.entity.Vehicle;

public interface VehicleRepository {
    void save(Vehicle vehicle);
    Vehicle findByRegistrationNumber(String RegistrationNumber);
    void delete(String RegistrationNumber);
}
