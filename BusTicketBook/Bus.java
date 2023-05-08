package BusTicketBooking;
public class Bus {

private String id;
private String source;
private String destination;
private double ticketPrice;

public Bus(String id, String source, String destination, double ticketPrice) {
    this.id = id;
    this.source = source;
    this.destination = destination;
    this.ticketPrice = ticketPrice;
}

public String getId() {
    return id;
}

public String getSource() {
    return source;
}

public String getDestination() {
    return destination;
}

public double getTicketPrice() {
    return ticketPrice;
}

public String toString() {
    return "Bus Number: " + id + "\nSource: " + source + "\nDestination: " + destination
            + "\nTicket Price: " + ticketPrice;
}
}