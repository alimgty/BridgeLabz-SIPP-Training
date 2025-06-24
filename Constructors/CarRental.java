
class CarRent {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0;

    public CarRent(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}

public class CarRental {
    public static void main(String[] args) {
        CarRent rental = new CarRent("Alex", "Hyundai i20", 5);
        rental.display();
    }
}
