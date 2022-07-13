package summer_tasks;

import java.util.Scanner;

public class genabarboskiny_task {
	public static void main(String[] args) {
		int writing_speed = 120;
		int writing_record = 1060;
		int months = 0;
		
		while (writing_speed < writing_record) {
			months+=1;
			writing_speed = writing_speed*2;
			
		}
		System.out.println("Gena Barboskiny needed " + months + " months to become a new world record holder");
	
	
	}


}
