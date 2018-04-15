// a custom exception class and it will return its name to ExceptionTest Class, once invoked.  
public class ExceptionA extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionA(String message) {
		super(message);
	}

}
