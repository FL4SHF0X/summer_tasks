package package2;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your weight: ");
		double weight_on_earth = in.nextInt();
		
		double weight_on_moon = weight_on_earth * 0.17;
		
		System.out.println("Your wight on earth: " + weight_on_earth + "kg");
		System.out.println("Your wight on moon: " + weight_on_moon + "kg");
		
	}

}
