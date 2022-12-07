package stringsPractice;

public class PermutationString {
	
	public static boolean isPermutation(String str1, String str2) {
//		To check the length of both string if they are equal 
//		then proceed f/w else return false
		if(str1.length() != str2.length()) {
			return false;
		}
//		To create a empty array of size 256
		int frequency[] = new int[256];
//	Intil256 size with 0 	
		for(int i  = 0; i < 256; i++) {
			frequency[i] = 0;
		}
//		add every letter of 1st string in 256 array
		for(int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			++frequency[ch];
		}
//      decrease with minus 1 for every existing letter of str2
		for(int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			--frequency[ch];
		}
//		to check every element of 256 size array are zero or  not
		for( int i =0; i < 256; i++) {
			if(frequency[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str1 = "abbcd";
		String  str2 = "bbcda";
		
		System.out.println(isPermutation(str1,str2));

	}

}
