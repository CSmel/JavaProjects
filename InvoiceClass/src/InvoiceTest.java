import java.util.Scanner;

public class InvoiceTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Invoice invoice = new Invoice("F13C", "Hammer", 1, 5.00); // these are fixed variables, but the variables will be updated at the end of the application.


	      // display the initial values
	      System.out.printf( "Part Number:%s --> Description:%s --> Quanity:%d --> Unit Price:$%.2f%n ",
	      invoice.getPartNum(), invoice.getPartDesc(), invoice.getQuantity(), invoice.getPricePerItem());
	      
	      
	      // create a Scanner to obtain input from the command window
	      Scanner input = new Scanner(System.in);
	      
	      System.out.print("Enter quantity: "); // prompt user
	      double quantityAmount = input.nextDouble(); // obtain user input for quantity

	      invoice.getInvoiceAmount(quantityAmount); // calculate the new quantity to the unit price.
	      // display base information about the product
	      System.out.println("--------------------------------");

	      System.out.println("New Invoice Information:");
	      System.out.printf("	Current Quantity: %d Item(s)\n  	Current Amount: $%.2f%n"
	    		  , invoice.getQuantity(), invoice.getPricePerItem());
	      System.out.println("--------------------------------");
	      System.out.printf("For --> Part Number: %s --> Description: %s\n", invoice.getPartNum(), invoice.getPartDesc());
	}

}
