
/**
 * Reading input from the console enables the program to accept 
 * input from user 
 * 
 * 
 * 
 * 
 * */
import java.util.Scanner; // Scanner is in the java.util package

public class listingChap2_3 {
	public static void main(String[] args) {
		
		// Step 1 : Create a scanner object 
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter a radius 
		System.out.println("Enter a number for radius: ");
		Double radius = input.nextDouble();
		
		// Compute Area
		
		Double area = radius * radius * 3.14159;
		
		//Display result 
		System.out.println("The area for the circle of radius " + 
		radius + " is " + area);
		
		
		
		

	}

}
