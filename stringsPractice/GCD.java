package stringsPractice;

import java.util.Scanner;

public class GCD {
	static int iGCD(int x, int y) {
		while(x % y != 0) {
			int rem = x % y;
			x = y;
			y = rem;
		}
		return y;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x= s.nextInt();
		int y=s.nextInt();
		
		System.out.println(iGCD(x,y));

	}

}
