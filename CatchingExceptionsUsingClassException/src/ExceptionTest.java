import java.io.IOException; // need to import the IOException
import java.lang.NullPointerException; // need to import NullPointerException
// The application will invoke two custom exception classes that originates from Exception class.
// Then the application will test the IOException and NullPointerException and display the stack information.

public class ExceptionTest {


	public static void main(String[] args) {
		{
		    // call exceptionA
		    try{
		        throw new ExceptionA(null); // the IDE told me to pass null as a parameter
		    } catch (Exception exception){
		    	exception.printStackTrace();
		       // System.out.println ("Threw Exception A"); <!-- This code seemed redundant, so I just commented it out.
		        

		    // call exceptionB
		    try{
		        throw new ExceptionB(null); // the IDE told me to pass null as a parameter
		    } catch (Exception exceptionTwo) {
		    	exceptionTwo.printStackTrace();
		       // System.out.println ("Threw Exception B"); <!-- This code seemed redundant, so I just commented it out.

		    // throw a NullPointerException
		    try{
		        throw new NullPointerException();
		    } catch (NullPointerException nullPointerException){
		    	nullPointerException.printStackTrace();
		    }
		    // throw IOException
		    try{
		        throw new IOException();
		    } catch (IOException io){
		        io.printStackTrace();

		    }    }

}
		    }
		}
	}
