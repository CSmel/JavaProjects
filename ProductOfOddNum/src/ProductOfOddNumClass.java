// This application will find all the odd integers between 1 - 15
// then will find the product of odd integers.
// 1 * 3 * 5 * 7 * 9 * 11 * 13 * 15 =  2027025
public class ProductOfOddNumClass {

	public static void main(String[] args) {
		int total = 1;
		int totalTwo = 1; // total from the previous iteration
		// odd numbers between 1 through 15.
		for (int number = 1; number <=15; number++) {
			if( number % 2 !=0 ) { // similar code that we used for the Odd or Even application
				total = total * number; // perform the multiplication
				totalTwo = total / number; // this will calculate the previous number that was used for the total
				// the syntax will be: new number * old total = new total
				System.out.printf("The product of %d X %d = %d%n", number, totalTwo, total);// display the output
			}			
		}	
		System.out.printf("<=============================================>%n");
		System.out.printf("The product of the combined odd integers: %d%n",total);// display the output
		}
	}