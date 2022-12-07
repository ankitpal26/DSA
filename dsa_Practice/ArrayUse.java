package dsa_Practice;
import java.util.Scanner;
public class ArrayUse {
	
	public static  int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size=s.nextInt();
		int input[] = new int[size];
		for(int i=0; i<size; i++) {
			input[i]=s.nextInt();
		}
		return input;
	}
	public static void print(int input[]) {

		  for(int i=0;i<input.length; i++) {
			System.out.print(input[i]+" ");
	}
		  System.out.println();

}
	public static int max(int input[]){
		int max=Integer.MIN_VALUE;;
		for(int i=0; i<input.length; i++) {
			if(input[i]>max) {
				max=input[i];
			}
		}
		return max;
		
	}
	public static void incementArray(int input[]) {
		for(int i =0; i< input.length; i++) {
			input[i]++;
		}
	}

	public static void AlternateSwap(int arr[]) {
		int i=0;int temp=0;
		while(i<arr.length) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			i+=2;
			
			
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		AlternateSwap(arr);
//		incementArray(arr);
		print(arr);
		
		
		}
}