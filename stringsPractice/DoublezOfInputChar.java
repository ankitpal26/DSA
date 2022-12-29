package stringsPractice;

import java.util.Scanner;

public class DoublezOfInputChar {

	public static void main(String[] args) {
		 
      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter the  Z and O");
      String str=sc.nextLine();
     String[] str1 = str.split("");
       
     
      int count=0,count1=0;
     for(int i=0; i<str1.length; i++) {
    	 if(str1[0].equals(str1[i])) {
    		 count++;
    	 }else {
    		 count1++;
    	 }
     }
     System.out.println(count);
     System.out.println(count1);
    	 if(count1==2*count) {
    		System.out.println("True");
    	 }else {
    		 System.out.println("False");
    	 }
	}
}


