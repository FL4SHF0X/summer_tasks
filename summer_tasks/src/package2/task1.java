package package2;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		String text = in.nextLine();
		
		if (text.indexOf(".") == -1) {
			System.out.println("Text: " + text);
			System.out.println("There is no dot in your text");
		} else {
			System.out.println("Text: " + text);
			System.out.println("Number of characters before dot: " + text.indexOf("."));
		}
		
		
		
		
		
		
		
	}

}
