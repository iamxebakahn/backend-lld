package parkinglot.client;

import parkinglot.entity.Vehicle;
import parkinglot.enums.VehicleType;
import parkinglot.repository.InMemoryVehicleRepository;
import parkinglot.repository.VehicleRepository;

public class VehicleRepositoryClient {
    public static void main(String[] args) {
        VehicleRepository repository = new InMemoryVehicleRepository();
        Vehicle vehicle = new Vehicle("KA01AB1234","Zeba","9878675432", VehicleType.CAR);
        repository.save(vehicle);
        Vehicle foundVehicle = repository.findByRegistrationNumber("KA01AB1234");
        System.out.println(foundVehicle.getOwnerName());
        Vehicle vehicle2 = new Vehicle("KA01AB1234","Another Owner", "9999999999",VehicleType.CAR);
        repository.save(vehicle2);
    }
}
