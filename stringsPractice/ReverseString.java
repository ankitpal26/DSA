package stringsPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner in = new Scanner(System.in);
	     String str = in.nextLine();
	     //char[] reverse = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
//			reverse += str.charAt(i);
		    System.out.print(str.charAt(i));
	

	}

	}
}
