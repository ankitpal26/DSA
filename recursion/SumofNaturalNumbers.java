package recursion;

public class SumofNaturalNumbers {
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		return sum(n-1)+n;
	}

	public static void main(String[] args) {
		System.out.println("Sum of Natural Numbers: "+ sum(50));

	}

}
