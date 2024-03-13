import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();
        
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        
        for(char c : input.toCharArray())
        	 map.put(c, map.getOrDefault(c, 0)+1);
        
        System.out.println(map);
        
        
        for(Entry<Character, Integer> m : map.entrySet())
        	System.out.println(m.getKey()+" : "+m.getValue());
	}

}
