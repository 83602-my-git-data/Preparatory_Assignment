import java.util.Scanner;

public class Q3 {
    public static void fibonacci(int n) {
        int first = 0, second = 1, next;
        System.out.println("Fibonacci Series up to " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            if (i <= 1)
                next = i;
            else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in Fibonacci Series: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            System.exit(1);
        }
        fibonacci(n);
    }
}

