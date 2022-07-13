package summer_tasks;

import java.util.Scanner;

public class gnome_task {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the lenght of your room");
		int a = in.nextInt(); 
		
		System.out.println("Please enter the width of your room");
		int b = in.nextInt();
		
		int area = a * b;
		
		double litre = area * 0.1;
		
		System.out.println("Your room requires " + litre + " litre of paint");
		
	}

}
