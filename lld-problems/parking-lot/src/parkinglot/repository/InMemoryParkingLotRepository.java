package parkinglot.repository;

import parkinglot.entity.ParkingLot;

import java.util.*;

public class InMemoryParkingLotRepository implements ParkingLotRepository{
    private final Map<String, ParkingLot> parkingLots;

    public InMemoryParkingLotRepository() {
        this.parkingLots = new HashMap<>();
    }

    @Override
    public void save(ParkingLot parkingLot) {
      if(parkingLot == null)
          throw new IllegalArgumentException("Parking lot cannot be null");

      if(parkingLots.containsKey(parkingLot.getParkingLotNumber()))
          throw new IllegalArgumentException("Parking lot with number "+ parkingLot.getParkingLotNumber()+" already exists");

      parkingLots.put(parkingLot.getParkingLotNumber(), parkingLot);
    }

    @Override
    public Optional<ParkingLot> findByParkingLotNumber(String parkingLotNumber) {
         if(parkingLotNumber == null || parkingLotNumber.isBlank())
             throw new IllegalArgumentException("Parking Lot Number cannot be null or blank");

         return Optional.ofNullable(parkingLots.get(parkingLotNumber));
    }

    @Override
    public List<ParkingLot> findAll() {
        return Collections.unmodifiableList(new ArrayList<>(parkingLots.values()));
    }
}
