package summer_tasks;

import java.util.Scanner;

public class rapuzel_task {
	public static boolean check_answers(int guess) {
		if (guess == 70) {
			return true;
		} return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your first guess on the lenght of Repunzels hair");
		int first = in.nextInt(); 
		
		System.out.println("Please enter your second guess on the lenght of Repunzels hair");
		int second = in.nextInt();
		
		System.out.println("Please enter your third guess on the lenght of Repunzels hair");
		int third = in.nextInt();
		
		
		
		if (check_answers(first) == true) {
			System.out.println("The price guessed correctly");
		} else if (check_answers(second)){
			System.out.println("The price guessed correctly");
		} else if (check_answers(third)) {
			System.out.println("The price guessed correctly");
		} else
			System.out.println("The price lost");
		
		
	}


}
