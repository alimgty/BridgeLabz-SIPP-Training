import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item code: ");
        int itemCode = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter item price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalCost = price * quantity;

        System.out.println("\n--- Item Details ---");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}
