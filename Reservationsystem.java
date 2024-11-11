import java.util.Scanner;
public class Reservationsystem {
    private static final int TOTAL_SEATS = 10;
    private static boolean[] seats = new boolean[TOTAL_SEATS];  // Array to track booked seats

    // Method to display available seats
    public static void showAvailableSeats() {
        System.out.println("\nAvailable Seats:");
        for (int i = 0; i < TOTAL_SEATS; i++) {
            if (!seats[i]) {
                System.out.print("Seat " + (i + 1) + " ");
            }
        }
        System.out.println();
    }

    // Method to book a seat
    public static void bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > TOTAL_SEATS) {
            System.out.println("Invalid seat number! Please choose a number between 1 and " + TOTAL_SEATS);
        } else if (seats[seatNumber - 1]) {
            System.out.println("Sorry, Seat " + seatNumber + " is already booked.");
        } else {
            seats[seatNumber - 1] = true;
            System.out.println("Seat " + seatNumber + " has been successfully booked.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Online Reservation System ---");
            System.out.println("1. Show Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showAvailableSeats();
                    break;
                case 2:
                    System.out.print("Enter seat number to book: ");
                    int seatNumber = scanner.nextInt();
                    bookSeat(seatNumber);
                    break;
                case 3:
                    System.out.println("Thank you for using the reservation system!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
} 

