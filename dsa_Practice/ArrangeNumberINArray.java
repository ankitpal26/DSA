package dsa_Practice;

import java.util.Scanner;

public class ArrangeNumberINArray {
	public static void arrange(int[] arr) {
		int left = 0;
		int n =arr.length;
		int right = n-1;
		int counter = 1 ;
		
		while(left <= right) {
			
			if(counter % 2 != 0) {
				arr[left] = counter;
				counter += 1;
				left += 1;
			}else {
				arr[right] = counter;
				counter += 1;
				right -= 1;
			}
		}
	}
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int input[] = new int[size];
		for(int i=0; i<size; i++) {
			input[i]=sc.nextInt();	
			}
		return input;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int [] arr = new int[n];
		arrange(arr);
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
