package dsa_Practice;

import java.util.Scanner;

public class Array2D {
	public static  int[][] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the number of Colomn");
		int col = sc.nextInt();
		int input[][] = new int[rows][col];
//		To take input from user for every elements of 2D array
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				System.out.println("Enter the element of"+i+"row"+j+"colomn");
				 input[i][j] = sc.nextInt();
			}
		}
		return input;
	}
	public static void   print(int input[][]) {
		int rows=input.length;
		int col=input[0].length;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
		
	}
     public static int largestColSum(int input[][]) {
    	 int largest=Integer.MIN_VALUE;
    	 int sum=0;
    	 for(int i=0; i<input.length; i++) {
    		 for(int j=0; j<input[0].length; j++) {
    			 sum += input[i][j];    		 }
    	 }
    	 if(sum > largest) {
    		 largest=sum;
    	 }
    	 return sum;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]arr=takeInput();
		print(arr);
		System.out.println(largestColSum(arr));

	}

}
