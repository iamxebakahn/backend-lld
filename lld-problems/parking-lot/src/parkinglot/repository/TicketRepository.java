package parkinglot.repository;

import parkinglot.entity.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketRepository {
    void save(Ticket ticket);
    Optional<Ticket> findByTicketNumber(String ticketNumber);
    List<Ticket> findAll();
}
