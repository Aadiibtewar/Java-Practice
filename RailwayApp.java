class TicketBooking {
    static int availableSeats = 5; // Shared by all threads

    // Synchronized ensures only one thread books at a time
    public synchronized void bookTicket(String name, int wantedSeats) {
        if (availableSeats >= wantedSeats) {
            System.out.println(name + " successfully booked " + wantedSeats + " seats.");
            availableSeats -= wantedSeats;
            System.out.println("Seats remaining: " + availableSeats);
        } else {
            System.out.println("Sorry " + name + ", not enough seats available.");
        }
    }
}

class Passenger extends Thread {
    TicketBooking system;
    int seats;

    Passenger(TicketBooking system, String name, int seats) {
        super(name); // Sets the thread name
        this.system = system;
        this.seats = seats;
    }

    public void run() {
        system.bookTicket(getName(), seats);
    }
}

public class RailwayApp {
    public static void main(String[] args) {
        TicketBooking centralSystem = new TicketBooking();

        // Simulate multiple people trying to book at the same time
        Passenger p1 = new Passenger(centralSystem, "User-A", 3);
        Passenger p2 = new Passenger(centralSystem, "User-B", 3); // Total wanted = 6 (more than 5)
        
        p1.start();
        p2.start();
    }
}