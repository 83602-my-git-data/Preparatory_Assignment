import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            System.exit(1);
        }
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int maxNumber = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("Maximum number is: " + maxNumber);
    }
}

