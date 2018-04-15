import java.util.Scanner; // program uses class Scanner
public class OddOrEvenApp {
// the application will determine if a given integer is even or odd.
	@SuppressWarnings("resource")
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in); // declare a variable for user input
		// main greeting
		System.out.print("Please enter an integer, so we find out if it's even or odd!\n");
		System.out.print("Enter a integer: "); // prompt user for input
		int num = input.nextInt(); // read number from user
		
		int numRemainder = num % 2; // this will perform a calculation to see if there's a remainder
		if (numRemainder == 0) { 	// if the remainder variable has NO remainder then it is even
				System.out.printf("The integer is even!");			
		}
		if (numRemainder == 1) {	// if the remainder variable has a remainder then it is odd		
			System.out.printf("The integer is odd!");			
		}
	}// close main method
}// close oddOrEven class
