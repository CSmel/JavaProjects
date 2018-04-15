
// This application will ask the user to input integers 1 - 5. These integers represent product numbers.
// Once the user enters the integers, then the switch statement will then identify which product number it is and
// then assigns the appropriate price to the variable. Also, the switch will calculate the quantity (++productOne) of each product and this 
// and this will be configured to the running total (totalRetail+=).

import java.util.Scanner;

public class CalculatingSalesClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int total = 0; // holds the total of values entered
		int itemCounter = 0; // holds the amount of items entered
		int productOne = 0; // count of product one
		int productTwo = 0; // count of product two
		int productThree = 0; // count of product three
		int productFour = 0; // count of product four
		int productFive = 0; // count of product five
		double totalRetail = 0;
		Scanner input = new Scanner(System.in);
	    System.out.printf("%s%n%s%n   %s%n   %s%n", 
	    		"Enter the integer product number in ranges 1 - 5", 
	    	    "Type the end-of-file indicator to terminate input:", 
	    	    "On UNIX/Linux/macOS type <Ctrl> d then press Enter",
	    	    "On Windows type <Ctrl> z then press Enter");
	    
	    // loop through until user enters the end-of-file indicator
	    while (input.hasNext()) {
	    	int productNumber = input.nextInt(); //analyze the product number
	    	total += productNumber; //add the product number to the total
	    	itemCounter++; // increment the number of products
	    	
	    	// once the productNumber variable reaches the switch statement then it will analyze which case it belongs to.
	    	switch (productNumber) {
	    	case 1:
	    		totalRetail += 2.98; // this will assign the price to the specific case and will update the total.
	    		++productOne;
	    		break;
	    	case 2:
	    		totalRetail += 4.50;
	    		++productTwo;
	    		break;
	    	case 3:
	    		totalRetail += 9.98;
	    		++productThree;
	    		break;
	    	case 4:
	    		totalRetail += 4.49;
	    		++productFour;
	    		break; 		
	    	case 5:
	    		totalRetail += 6.87;
	    		++productFive;
	    		break;
	    	}
	    }
	    System.out.printf("%n Quantity of Products%n");
	    		if (itemCounter != 0) {    			
	    			System.out.printf("The quantity entered is: %d%n", itemCounter, total);

					System.out.printf("The total retail is: $%.2f%n", totalRetail );
	    			System.out.printf("%n%s %n%s %d%n%s %d%n%s %d%n%s %d%n%s %d%n",
	    					"Quantity of Product(s):",
	    					"Product One-> ", productOne,
	    					"Product Two-> ", productTwo,
	    					"Product Three-> ", productThree,
	    					"Product Four-> ", productFour,
	    					"Product Five-> ", productFive);
	    		}
	    		else {System.out.println("Nothing was entered");		
	    		}	    	
	}
}
	

