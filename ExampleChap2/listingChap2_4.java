
/**
 * taking multiple input from user 
 * */

import java.util.*;



public class listingChap2_4 {
	public static void main(String[] args) {
		
		// Create scanner object 
		
		Scanner input = new Scanner (System.in);
		
		// prompt the user to enter three numbers
		
		System.out.print("Enter 3 numbers:");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		//Compute Average 
		double average = (num1 + num2 + num3 ) / 3 ;
		
		// Display result 
		System.out.println("the avarage of all 3 number"
				+ " add is " + average);
		

	}

}
