
class HotelBook {
    String guestName;
    String roomType;
    int nights;

    public HotelBook() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBook(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBook(HotelBook other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

public class HotelBooking {
    public static void main(String[] args) {
        HotelBook defaultBooking = new HotelBook();
        HotelBook customBooking = new HotelBook("John Doe", "Deluxe", 3);
        HotelBook copiedBooking = new HotelBook(customBooking);

        System.out.println("Default Booking:");
        defaultBooking.display();
        System.out.println("\nCustom Booking:");
        customBooking.display();
        System.out.println("\nCopied Booking:");
        copiedBooking.display();
    }
}
