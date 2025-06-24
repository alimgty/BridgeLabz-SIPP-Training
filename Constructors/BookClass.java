import java.util.*;

class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookExample {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book paramBook = new Book("Java Programming", "James Gosling", 599.99);

        System.out.println("Default Book:");
        defaultBook.display();
        System.out.println("\nParameterized Book:");
        paramBook.display();
    }
}
