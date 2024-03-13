import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int n, i;
        long fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        n = scanner.nextInt();
        if (n < 0)
            System.out.println("Factorial of a negative number doesn't exist.");
        else {
            for (i = 1; i <= n; ++i) {
                fact *= i;
            }
            System.out.printf("Factorial of %d = %d", n, fact);
        }
    }
}

