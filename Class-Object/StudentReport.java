import java.util.Scanner;

public class Main {
    public static char calculateGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        char grade = calculateGrade(marks);

        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
