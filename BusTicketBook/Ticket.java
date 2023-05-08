package BusTicketBooking;

public class Ticket {

    private Bus bus;
    private String passengerName;
    private int age;
    private String email;

    public Ticket(Bus bus, String passengerName, int age, String email) {
        this.bus = bus;
        this.passengerName = passengerName;
        this.age = age;
        this.email = email;
    }

    public String toString() {
        return "Bus Number: " + bus.getId() + "\nName of the passenger: " + passengerName + "\nAge: " + age + "\nEmail: "
                + email;
    }

}