// This application with ask the user to input 3 different floating point numbers.
// The application will then use minimum3 method to determine the lowest number. 
// Programmer-declared method maximum with three double parameters.
import java.util.Scanner;

public class MininumThree {
   @SuppressWarnings("resource")
public static void main(String[] args) {
      // create Scanner for input from command window
      Scanner input = new Scanner(System.in);

      // prompt for and input three floating-point values
      System.out.print(
         "Enter three floating-point values separated by spaces: ");
      double number1 = input.nextDouble(); // read first double
      double number2 = input.nextDouble(); // read second double
      double number3 = input.nextDouble(); // read second double

      // determine the minimum value
      double result = minimum3(number1, number2, number3); 

      // display minimum3 value 
      System.out.println("Minimum is: " + result);
	
   }
     // implemented the Math.Min method
      public static  double minimum3(double x, double y, double z) {
    	  return Math.min(x, Math.min(y ,z)); // returns back to the  result, so it is displayed.
      }
} 