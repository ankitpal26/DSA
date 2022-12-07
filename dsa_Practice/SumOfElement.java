package dsa_Practice;

import java.util.Scanner;

public class SumOfElement {
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int input[] = new int[size];
		for(int i=0; i<size; i++) {
			input[i]=sc.nextInt();	
			}
		return input;
		
	}
	public static int Sum(int [] input) {
		int sum=0;
		for(int i=0; i<input.length; i++) {
			sum += input[i];
		}
		return sum;
		
	}
	public  static int LinearSearch(int [] arr, int x) {
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
	
		}
		return -1;
	
		
	}
	public static void main(String[] args) {
		int arr[]=takeInput();
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(LinearSearch(arr,x));
		
	}

}
