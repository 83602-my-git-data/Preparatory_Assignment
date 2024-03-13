
	import java.util.Scanner;
public class Q9 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        System.out.println("Given Number: " + number);
	        System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
	        System.out.println("Octal equivalent: " + Integer.toOctalString(number));
	        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number));
	        
	        String binary = convertToBinary(number);
	        String octal = convertToOctal(number);
	        String hexadecimal = convertToHexadecimal(number);
	        
	        System.out.println("Binary equivalent: " + binary);
	        System.out.println("Octal equivalent: " + octal);
	        System.out.println("Hexadecimal equivalent: " + hexadecimal);
	    }
	    
    public static String convertToBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.append(number % 2);
           // binary.insert(0, number % 2);
            number /= 2;
        }
        return binary.reverse().toString();
    }
    public static String convertToOctal(int number) {
        StringBuilder octal = new StringBuilder();
        while (number > 0) {
            octal.append(number % 8);
           // octal.insert(0, number%8);
            number /= 8;
        }
        return octal.reverse().toString();
    }
    public static String convertToHexadecimal(int number) {
        StringBuilder hexadecimal = new StringBuilder();
        while (number > 0) {
            int remainder = number % 16;
            if (remainder < 10) {
                hexadecimal.append((char) ('0' + remainder));
                //hexadecimal.insert(0,(char) ('0' + remainder));
            } else {
                hexadecimal.append((char)('a' + remainder - 10));
                //hexadecimal.insert(0,(char) ('a' + remainder-10));
            }
            number /= 16;
        }
        return hexadecimal.reverse().toString();
    }
}
