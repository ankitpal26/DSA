package arrays;

import java.util.Scanner;

public class RightRotate {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr number of Rotation :");
		int n = sc.nextInt();
		System.out.print("Array before the Rotation: ");
         for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		for(int i=0; i<n; i++) {
			int  last;
			last=arr[arr.length-1];
			for(int j1=arr.length-1; j1>0; j1--) {
				arr[j1]=arr[j1-1];
			}
			arr[0]=last;
		}
		System.out.println();
		System.out.print("Array after the Rotation: ");
          for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
	}

}
