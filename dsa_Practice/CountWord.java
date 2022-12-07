package dsa_Practice;

import java.util.Scanner;

public class CountWord {
	 public static int countWords(String input) {
		 int wordCount =0;
		 for(int i=0; i<input.length()-1;i++) {
			if(input.charAt(i) ==' ') {
				wordCount++;
			}
			
		 }
		 wordCount++;
		 return wordCount;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String  input = s.nextLine();
		System.out.println("Words count are :"+ countWords(input));

	}

}
