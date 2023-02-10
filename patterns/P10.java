package patterns;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1; 
		int counter=1;
		
			while(i <= n) {
				int j = 1;
				
				while(j <= n-i) {
					System.out.print(" ");
					j++;
				}
				int k=1;
				while(k <= i) {
					System.out.print(counter);
					counter++;
					k++;
				}
				int l=1; 
				while(l <= i-1) {
					System.out.print(counter--);
					counter--;
					l++;
				}
				System.out.println();
				i++;
			}
		}

	}

