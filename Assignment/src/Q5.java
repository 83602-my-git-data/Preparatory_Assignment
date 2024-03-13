import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        int uppercaseCount = 0, lowercaseCount = 0, digitCount = 0, otherCount = 0;
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("Uppercase characters: " + uppercaseCount);
        System.out.println("Lowercase characters: " + lowercaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Other characters: " + otherCount);
    }
}

