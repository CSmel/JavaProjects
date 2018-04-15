// a custom exception class and it will return its name to ExceptionTest Class, once invoked.    
public class ExceptionB extends ExceptionA {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public ExceptionB(String message){
            super(message);
        }
    }