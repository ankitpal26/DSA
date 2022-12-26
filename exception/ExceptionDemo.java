package exception;

public class ExceptionDemo {
	
	
		
	public static int divide(int a, int b) throws DivideByZeroException {
		if(b==0) {
			throw new DivideByZeroException();
		}
			return a/b;
		}
	public static void main(String[] args)  {
		
		try {
			divide(10, 5);
			System.out.println("within try");
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Divide by zero exception raised");
		}
		System.out.println("Main");
	}

}
