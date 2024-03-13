import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks for each subject: ");
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        System.out.println("Total Marks=" + total);
        if (total >= 90) {
            System.out.println("Grade Ex");
        } else if (total < 90 && total >= 80) {
            System.out.println("Grade A");
        } else if (total < 80 && total >= 70) {
            System.out.println("Grade B");
        } else if (total < 70 && total >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
    }
}

