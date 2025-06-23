import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();
        System.out.print("Enter seat number: ");
        String seatNumber = sc.nextLine();
        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}
