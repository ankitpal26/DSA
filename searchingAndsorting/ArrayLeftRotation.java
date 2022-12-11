package searchingAndsorting;

import java.util.Scanner;

public class ArrayLeftRotation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array :");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}