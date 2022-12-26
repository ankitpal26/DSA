package exception;

public class ExceptionDemo {
	
	public static int fact(int n) throws NegativeNumberException {
		if (n < 0) {
			throw  new NegativeNumberException();
		}
		int ans = 1;
		for(int i = 2; i <= n; i++) {
			ans = ans * i;
		}
		return ans;
	}
		
	public static int divide(int a, int b) throws DivideByZeroException {
		if(b==0) {
			throw new DivideByZeroException();
		}
			return a/b;
		}
	public static void main(String[] args)  {
		
		try {
			divide(10, 5);
			System.out.println(fact(1));
			System.out.println("within try");
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Divide by zero exception raised");
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Negative number Exception");
		}catch (Exception e) {
			System.out.println("genric Exception");
		}finally {
			System.out.println("Finally");
		}
		System.out.println("Main");
	}

}
