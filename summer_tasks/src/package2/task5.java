package package2;

import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		
		String s = "abcdefghijklmnopqrstuvwxyz";
		
		int x = (int)(Math.random()*(26)+1);
		//System.out.println(x);
		char string = s.charAt(x-1);
		
		char guess = 0;
		System.out.println("Please enter letter you want to guess: ");
		
		int attempts = 0;
		
		
		
		while (string != guess) {
			Scanner in = new Scanner(System.in);
			String str = in.next();
			guess = str.charAt(0);
			attempts++;
			if (string > guess) {
				System.out.println("You're too low");
				continue;
			} else if (string < guess) {
				System.out.println("You're too high");
				continue;
			} else {
				System.out.println("You guessed the letter correctly");
				break;
			}
			
		}
		System.out.println("The letter was " + string);
		System.out.println("You requiered " + attempts +" tries");
		
		
		
		

	}


}
