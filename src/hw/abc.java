package hw;

import java.util.Scanner;

public class abc {
	
	public static void  main(String[] args) {
		
		System.out.println("Hello World");
		
		Scanner user = new Scanner(System.in);
		System.out.println("Give me a color");
		String color = user.next();
		
		// if (color.equalsIgnoreCase("green") || color.equalsIgnoreCase("blue")) {
		//	 System.out.println("sky");
		// }
		 
		/*
		 * if (color.contains("r") && color.contains("e")) {
		 * System.out.println("CHECK"); }
		 */
			
			  if (color.contains("r") && color.contains("e") ||
			  color.contains("b")) { System.out.println("CHECK"); }
			 
}

}
