package package2;

import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a interval between the lightning and thunder: ");
		double time = in.nextDouble();
		
		// speed of sound = 1100 foot/s
		// speed of sound = 343,2 m/s
		double velocity = 343.2;
		
		double distance = velocity * time;
		
		distance = Math.round(distance);
		distance = distance / 1000;
		
		System.out.println("The lightning is " + distance + " km away");
	}

	
}
