import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter coding marks: ");
        double codingMarks = scanner.nextDouble();

        System.out.println();
        System.out.println("Student details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Coding marks: " + codingMarks);

        scanner.close();
    }
}