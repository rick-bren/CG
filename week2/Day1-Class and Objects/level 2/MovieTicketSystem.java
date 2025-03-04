import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket() {
        this.movieName = "";
        this.seatNumber = "";
        this.price = 0.0;
    }
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }
    public void displayTicket() {
        if (movieName.isEmpty()) {
            System.out.println("No ticket booked yet.");
        } else {
            System.out.println("\n--- Ticket Details ---");
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + String.format("%.2f", price));
        }
    }
}

public class MovieTicketSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        System.out.println("🎬 Welcome to the Movie Ticket Booking System!");

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Enter Seat Number (e.g., A10): ");
        String seat = sc.nextLine();

        System.out.print("Enter Ticket Price: ₹");
        double price = sc.nextDouble();
        ticket.bookTicket(movie, seat, price);
        ticket.displayTicket();

        sc.close();
    }
}
