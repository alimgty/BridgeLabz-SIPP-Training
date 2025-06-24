
class Book {
    String title;
    String author;
    double price;
    boolean available;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book already borrowed.");
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author +
                ", Price: " + price + ", Available: " + available);
    }
}

public class LibraryBook {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin", 450.0);
        book.display();
        book.borrowBook();
        book.display();
        book.borrowBook(); // Attempting to borrow again
    }
}
