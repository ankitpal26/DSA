package recursion;

import java.util.Scanner;

public class NcR {
	public static int factorial(int n) {
		int ans = 1;
		for(int i=1; i<=n ; i++) {
			ans *= i;
		}
		return ans;
	}

	public static boolean isPrime(int n) {
		int d = 2;
		while(d < n) {
			if(n % d == 0) {
				return false;
			}
			d++;
		}
		return true;
	}
	public static void printTillN(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int N = s.nextInt();
       int R = s.nextInt();
       
       boolean ansPrime = isPrime(13);
       System.out.println(ansPrime);
       
       int num = factorial(N);
       int dem1 = factorial(R);
       int dem2 = factorial(N-R);
       
       int ans = num/(dem1*dem2);
       System.out.println(ans);

	}

}
