package patterns;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1; 
		{
			while(i <= n) {
				int j = 1;
				
				while(j <= n-i) {
					System.out.print(" ");
					j++;
				}
				int num=1;
				while(num <= i) {
					System.out.print(num);
					num++;
				}
				int num2=1;
				while(num2 <= i-1) {
					System.out.print(num2);
					num2++;
				}
				System.out.println();
				i++;
			}
		}

	}

}
