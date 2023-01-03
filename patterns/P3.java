package patterns;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value of n:");
		int n = s.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
