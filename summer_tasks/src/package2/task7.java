package package2;

public class task7 {
	public static void main(String[] args) {
		String[] names = new String [] {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt","Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
		int[] times = new int[] {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 203, 343, 317, 265 };
		
		int temp = 0;
		int pos = 0;
		boolean isSorted = false;
		int buf;
		
		String buf_str;
		
		
		while (!isSorted) {
			isSorted = true;
			for (int i=0; i < times.length-1; i++) {
				if (times[i] > times[i+1]) {
					isSorted = false;
					buf = times[i];
					times[i] = times[i+1];
					times[i+1] = buf;
					
					
					buf_str = names[i];
					names[i] = names[i+1];
					names[i+1] = buf_str;
					
					
				}
			}
		}
		
		System.out.println("These are the best three competitors: ");
		System.out.println("3. " + names[2] + ": "+ times[2]);
		System.out.println("2. " + names[1] + ": "+ times[1]);
		System.out.println("1. " + names[0] + ": "+ times[0]);
		
		
		
		
		
	}

}
