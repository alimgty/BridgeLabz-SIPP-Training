import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static class CartItem {
        String itemName;
        double price;
        int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        double getTotalCost() {
            return price * quantity;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter item price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    cart.add(new CartItem(name, price, quantity));
                    System.out.println("Item added to cart.");
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemToRemove = sc.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < cart.size(); i++) {
                        if (cart.get(i).itemName.equalsIgnoreCase(itemToRemove)) {
                            cart.remove(i);
                            removed = true;
                            System.out.println("Item removed.");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Item not found in cart.");
                    }
                    break;

                case 3:
                    double total = 0;
                    System.out.println("\n--- Cart Items ---");
                    for (CartItem item : cart) {
                        System.out.println(item.itemName + " x" + item.quantity + " = ₹" + item.getTotalCost());
                        total += item.getTotalCost();
                    }
                    System.out.println("Total Cost: ₹" + total);
                    break;

                case 4:
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}
