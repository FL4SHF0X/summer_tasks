package package2;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String sentence = in.nextLine();
		
		System.out.println(sentence.replaceAll("first", "last"));
	
	}

}
	
