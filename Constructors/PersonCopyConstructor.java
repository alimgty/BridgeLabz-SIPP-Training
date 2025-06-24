
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonCopyConstructor {
    public static void main(String[] args) {
        Person original = new Person("Alice", 25);
        Person copy = new Person(original);

        System.out.println("Original Person:");
        original.display();
        System.out.println("Copied Person:");
        copy.display();
    }
}
