
import java.util.Scanner;


public class QuartsToGallons {

	public static void main(String[] args) {

//		1.	Write a program that declares a named constant to hold the number of quarts in a gallon (4)
//		[1 gallon = 4 quarts]. Also declare a variable to represent the number of quarts needed for a 
//		painting job, and assign an appropriate value, for example, 18. Compute and display the number 
//		of gallons and quarts needed for the job. Display explanatory text with the values, for example, 
//		A job that needs 18 quarts requires 4 gallons plus 2 quarts. Save the program as QuartsToGallons.java.
		
//		2.	Convert the QuartsToGallons program to an interactive application. Instead of assigning a value
//		to the number of quarts, accept the value from the user as input. Save the revised program as
//		QuartsToGallonsInteractive.java.

		
		//Create a constant to hold the number of quarts per gallon
		final int QUARTS_X_GALLON = 4;
		// Create a variable to hold the number of quarts needed for a paint job
		int numQuartsPaintJob = 18;
		// Create a variable to hold the number of gallons needed for a paint job
		int numGallonsPaintJob = numQuartsPaintJob/QUARTS_X_GALLON;
		
//		
//		System.out.print("A job that needs " + numQuartsPaintJob + " quarts requires " + 
//				numGallonsPaintJob + " gallons" + " plus " + 
//				String.format("%.0f",((double)numQuartsPaintJob/QUARTS_X_GALLON - numGallonsPaintJob)*4) + 
//				" quarts." );
//		
		
		//Turning into an interactive program
		Scanner input = new Scanner(System.in);
		System.out.print("\n\n");
		boolean again = true;
		
		while (again) {
			System.out.print("Enter the number of quarters needed for a paint job (press -99 to exit) >>");
			String entry = input.nextLine();
			
			if (Integer.parseInt(entry) == -99) {
				again = false;
				System.out.print("Thanks for using the app!");
				
			}
			else {
			System.out.print("A job that needs " + entry + " quarts requires " + 
					Integer.parseInt(entry)/QUARTS_X_GALLON + " gallons" + " plus " + 
					String.format("%.0f",((double)Integer.parseInt(entry)/QUARTS_X_GALLON - 
							Integer.parseInt(entry)/QUARTS_X_GALLON)*4) + 
					" quarts." );
			System.out.print("\n\n");
			}
	
		}
		

		
		

	}

}

