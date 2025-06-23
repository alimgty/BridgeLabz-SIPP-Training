import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.println("\n--- Mobile Phone Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
