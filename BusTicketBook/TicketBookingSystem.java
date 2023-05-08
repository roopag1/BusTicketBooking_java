package BusTicketBooking;


import java.util.HashMap;
import java.util.Map;

public class TicketBookingSystem implements Bookable {
    private Map<String, Bus> buses;

    public TicketBookingSystem() {
        buses = new HashMap<>();
    }

    public void addBus(Bus bus) {
        buses.put(bus.getId(), bus);
    }

    public Bus findBus(String source, String destination) {
        for (Bus bus : buses.values()) {
            if (bus.getSource().equals(source) && bus.getDestination().equals(destination)) {
                return bus;
            }
        }
        return null;
    }

    public boolean bookTicket(String source, String destination, String name, int age, String email) throws NoBusAvailableException {
        Bus bus = findBus(source, destination);
        if (bus == null) {
            throw new NoBusAvailableException("No buses available for the given source and destination.");
        }

        System.out.println("\nBus Details:");
        System.out.println(bus);
        System.out.println("\nBooking Confirmed");
        System.out.println("\nTicket Details:");
        Ticket ticket = new Ticket(bus, name, age, email);
        System.out.println(ticket);
        return true;
    }
}

