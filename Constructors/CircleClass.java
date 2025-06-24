import java.util.*;

class Circle {
    double radius;

    public Circle() {
        this(1.0);  // Constructor chaining
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleClass {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle userCircle = new Circle(5.0);

        System.out.println("Default Circle Area: " + defaultCircle.getArea());
        System.out.println("User Circle Area: " + userCircle.getArea());
    }
}
