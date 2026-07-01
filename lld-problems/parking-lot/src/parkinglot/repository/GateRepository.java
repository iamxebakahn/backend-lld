package parkinglot.repository;
import parkinglot.entity.Gate;

import java.util.List;
import java.util.Optional;

public interface GateRepository {

    void save(Gate gate);
    Optional<Gate> findByGateNumber(String gateNumber);
    List<Gate> findAll();

}
