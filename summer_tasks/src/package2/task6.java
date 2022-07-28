package package2;

import java.util.Scanner;

public class task6 {
	public static String reverse_string(String str) {

	    String reverse_str = "";

	    for (int i = str.length() - 1; i >= 0; i--) {
	    	reverse_str = reverse_str + str.charAt(i);
	    }

	    return reverse_str;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a sentence ");
		String str = in.nextLine();
		
		System.out.println("Input string: " + str);
		System.out.println("Output (reverse) string; " + reverse_string(str));
		
	}
}
