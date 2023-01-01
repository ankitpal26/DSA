package recursion;

import java.util.Scanner;

public class XtoPowerN {
	public static int power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		if( x == 0) {
			return 0;
		}
		if (n == 0 && x == 0) {
			return 0;
		}
		int smallAns = power(x, n/2);
		if( n % 2 == 0) {
			return smallAns * smallAns;
		}else {
			return x * smallAns * smallAns;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x= s.nextInt();
		int n = s.nextInt();
		System.out.println(x +" to power "+ n + " is equal to : "+ power( x, n)); 

	}

}
