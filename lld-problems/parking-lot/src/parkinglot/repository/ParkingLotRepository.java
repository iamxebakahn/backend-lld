package parkinglot.repository;

import parkinglot.entity.ParkingLot;
import parkinglot.entity.ParkingSpot;
import java.util.List;
import java.util.Optional;

public interface ParkingLotRepository {
    void save(ParkingLot parkingLot);
    Optional<ParkingLot> findByParkingLotNumber(String parkingLotNumber);
    List<ParkingLot> findAll();
}
