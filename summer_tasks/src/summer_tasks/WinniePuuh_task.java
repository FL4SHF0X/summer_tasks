package summer_tasks;

import java.util.Scanner;

public class WinniePuuh_task {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much honey does Winnie Puuh ate?");
		int a = in.nextInt(); 
		
		int new_waist = 80 + 2*a;  
		
		if (new_waist <= 95) {
			System.out.println("Winnie Puuh fits in");
		} else
			System.out.println("Winnie Puuh is too fat");
		
		
		
	}
}
