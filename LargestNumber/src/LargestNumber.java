// this application will ask the user to input 10 integers.
// the application will hold the highest number, then display it at the end of the application.
//=============
//while the counter is less than or equal to 10
// system print out a question
// store the input as a variable named number
// if number is less than or equal to largest number
// add the highest number to the x variable
// the largest number variable and number
// increment counter
// print out largest number



import java.util.Scanner; // this class will be using a Scanner
public class LargestNumber {
	public static void main(String[] args) {
		
		// create a scanner to obtain input from the user
	      @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	
	      // initialize variables
	      int counter = 1; // the counter is used so the input is repeated 10 times. 
	      int largestNum = 0; // set the largest total to zero 	      
	      int x = 0;
	      	      
	      // only ask the question 10 times
	      while (counter <= 10) {
	    	  
	    	  // ask user to input an integer
	    	  System.out.print(+counter+") Units Sold? ");
	    	  // store the integer as a variable named number
	          int number = input.nextInt();	          

	          // if number is greater than/equal to, then 
	        	  if(number >= largestNum) {
	    	         number+=x;
	    	         // determine the highest number
	    	         // then set the number variable as largestNum variable
	    	         largestNum = number;
	        	  }	        	 
	        	     ++counter; // increment counter   	  
	      }
	  
	      // termination phase; prepare and display results
	      System.out.println("======================="); 
	      System.out.printf("Largest number is: %d%n", largestNum);    
	}
}
