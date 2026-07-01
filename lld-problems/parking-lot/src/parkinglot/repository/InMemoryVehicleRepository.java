package parkinglot.repository;
import parkinglot.entity.Vehicle;
import java.util.HashMap;
import java.util.Map;

public class InMemoryVehicleRepository implements VehicleRepository {
    private final Map<String,Vehicle> vehicles;

    public InMemoryVehicleRepository(){
        vehicles = new HashMap<>();
    }
    @Override
    public void save(Vehicle vehicle) {
        if(vehicle == null)
            throw new IllegalArgumentException("Vehicle cannot be null");
        if(vehicles.containsKey(vehicle.getRegistrationNumber()))
            throw new IllegalArgumentException("Vehicle with registration number "+vehicle.getRegistrationNumber() + " already exists");

        vehicles.put(vehicle.getRegistrationNumber(),vehicle);
    }

    @Override
    public Vehicle findByRegistrationNumber(String registrationNumber) {
        return vehicles.get(registrationNumber);
    }

    @Override
    public void delete(String registrationNumber) {
        vehicles.remove(registrationNumber);
    }
}
