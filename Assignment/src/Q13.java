   
	import java.util.*;
public class Q13 {
	    public static void main(String[] args) {
	        String[] strings = {"apple", "banana", "apple", "orange", "banana", "grape"};

	        Set<String> uniqueStrings = new HashSet<>();
	        Set<String> duplicateStrings = new HashSet<>();

	        for (String str : strings) {
	            if (!uniqueStrings.add(str)) {
	                duplicateStrings.add(str);
	            }
	        }

	        if (duplicateStrings.isEmpty()) {
	            System.out.println("No duplicate strings found.");
	        } else {
	            System.out.println("Duplicate strings:");
	            for (String str : duplicateStrings) {
	                System.out.println(str);
	            }
	        }
	    }
	}

