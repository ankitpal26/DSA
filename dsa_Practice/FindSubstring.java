package dsa_Practice;

public class FindSubstring {
	public static void printSubstring(String input) {
		for(int start=0; start<input.length();start++) {
			for(int end = start+1; end<= input.length(); end++) {
				System.out.println(input.substring(start,end));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "abcd";
       printSubstring(str);
	}

}
