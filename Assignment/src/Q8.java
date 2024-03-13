import java.util.Scanner;

public class Q8 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter student name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter roll number: ");
	        String rollNo = scanner.nextLine();

	        System.out.print("Enter total marks obtained: ");
	        int marks = scanner.nextInt();

	        scanner.close();

	        // Create student object
	        Student student = new Student(name, rollNo, marks);

	        // Display student data
	        System.out.println("\nStudent Details:");
	        student.toString();
	    }
	}
