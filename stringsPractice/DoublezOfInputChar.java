package stringsPractice;

import java.util.Scanner;

public class DoublezOfInputChar {

	public static void main(String[] args) {
		 
      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter the  Z and O");
      String str1=sc.nextLine();
//      String[] words = str1.split("\\s");
       
     
      int count=0,count1=0;
     for(int i=0; i<str1.length(); i++) {
    	 if(str1.charAt(i)=='Z') {
    		 count++;
    	 }
     }
     System.out.println(count);
    	 for(int j=0; j<str1.length(); j++) {
        	 if(str1.charAt(j)=='O') {
        		 count1++;
        	 }
          }
    	 System.out.println(count1);
    	 if(count1==2*count) {
    		System.out.println("True");
    	 }else {
    		 System.out.println("False");
    	 }
	}
}


