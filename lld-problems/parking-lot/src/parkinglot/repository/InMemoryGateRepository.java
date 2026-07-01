package parkinglot.repository;

import parkinglot.entity.Gate;

import java.awt.*;
import java.awt.List;
import java.util.*;

public class InMemoryGateRepository implements GateRepository{
    private final Map<String, Gate> gates;

    public InMemoryGateRepository() {
        this.gates = new HashMap<>();
    }

    @Override
    public void save(Gate gate) {

        if (gate == null) {
            throw new IllegalArgumentException("Gate cannot be null.");
        }

        if (gates.containsKey(gate.getGateNumber())) {
            throw new IllegalArgumentException("Gate with number " + gate.getGateNumber() + " already exists.");
        }

        gates.put(gate.getGateNumber(), gate);
    }

    @Override
    public Optional<Gate> findByGateNumber(String gateNumber) {

        if (gateNumber == null || gateNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Gate number cannot be null or blank."
            );
        }

        return Optional.ofNullable(gates.get(gateNumber));
    }

    @Override
    public List<Gate> findAll() {

        return Collections.unmodifiableList(new ArrayList<>(gates.values()));
    }


}
