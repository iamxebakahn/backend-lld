package parkinglot.repository;

import parkinglot.entity.Ticket;

import java.util.*;

public class InMemoryTicketRepository implements TicketRepository{
    public final Map<String, Ticket> tickets;

    public InMemoryTicketRepository() {
        this.tickets = new HashMap<>();
    }

    @Override
    public void save(Ticket ticket) {
        if (ticket == null) {
            throw new IllegalArgumentException(
                    "Ticket cannot be null."
            );
        }

        if (tickets.containsKey(ticket.getTicketNumber())) {
            throw new IllegalArgumentException(
                    "Ticket with number "
                            + ticket.getTicketNumber()
                            + " already exists."
            );
        }

        tickets.put(ticket.getTicketNumber(), ticket);
    }

    @Override
    public Optional<Ticket> findByTicketNumber(String ticketNumber) {
        if (ticketNumber == null || ticketNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Ticket number cannot be null or blank."
            );
        }

        return Optional.ofNullable(
                tickets.get(ticketNumber)
        );
    }

    @Override
    public List<Ticket> findAll() {
        return Collections.unmodifiableList(new ArrayList<>(tickets.values()));
    }
}
