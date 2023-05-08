package BusTicketBooking;
import java.util.Scanner;

public class BusBooking{
    public static void main(String[] args) {
//         Bus[] buses = {
//                 new Bus("1", "Bengaluru", "Jaipur",  6500),
//                 new Bus("2", "Chandigarh", "Chennai", 3500),
//                 new Bus("3", "Tumkur", "Bengaluru", 800),
//                 new Bus("4", "Chennai","Bangalore", 2000),
//                 new Bus("5", "Hyderabad", "Mumbai", 2200),
//                 new Bus("5", "Patna", "Mumbai", 5000),
//                 new Bus("5", "Kolkata", "Shimla", 5200)
//         };
//         try {
//             Scanner scanner = new Scanner(System.in);
//             System.out.print("Enter source city: ");
//             String source = scanner.nextLine();
//             System.out.print("Enter destination city: ");
//             String destination = scanner.nextLine();
//             boolean foundBuses = false;
//             for (Bus bus : buses) {
//                 if (bus.getSource().equals(source) && bus.getDestination().equals(destination)) {
//                     foundBuses = true;
//                     System.out.println("\nBus Details:");
//                     System.out.println(bus);
//                     System.out.print("Enter your name: ");
//                     String name = scanner.nextLine();
//                     System.out.print("Enter your age: ");
//                     int age = scanner.nextInt();
//                     scanner.nextLine();
//                     System.out.print("Enter your email: ");
//                     String email = scanner.nextLine();
//                     System.out.println("\nBooking Confirmed");
//                     System.out.println("\nTicket Details:");
//                     Ticket ticket = new Ticket(bus, name, age, email);
//                     System.out.println(ticket);
//                     break;
//                 }
//             }
//             if (!foundBuses) {
//                 System.out.println("No buses available for the given source and destination.");
//             }
//             scanner.close();
//         } catch (Exception e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
//     }
// }


		TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();

		ticketBookingSystem.addBus(new Bus("1", "Bengaluru", "Jaipur", 6500));
		ticketBookingSystem.addBus(new Bus("2", "Chandigarh", "Chennai", 3500));
		ticketBookingSystem.addBus(new Bus("3", "Tumkur", "Bengaluru", 800));
		ticketBookingSystem.addBus(new Bus("4", "Chennai", "Bangalore", 2000));
		ticketBookingSystem.addBus(new Bus("5", "Hyderabad", "Mumbai", 2200));
		ticketBookingSystem.addBus(new Bus("6", "Patna", "Mumbai", 5000));
		ticketBookingSystem.addBus(new Bus("7", "Kolkata", "Shimla", 5200));

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter source city: ");
			String source = scanner.nextLine();
			System.out.print("Enter destination city: ");
			String destination = scanner.nextLine();

			Bus availableBus = ticketBookingSystem.findBus(source, destination);

			if (availableBus == null) {
				System.out.println("No buses available for the given source and destination.");
			} else {
				System.out.print("Enter your name: ");
				String name = scanner.nextLine();
				System.out.print("Enter your age: ");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter your email: ");
				String email = scanner.nextLine();

				ticketBookingSystem.bookTicket(source, destination, name, age, email);
			}

			scanner.close();
		} catch (NoBusAvailableException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}