package stringsPractice;

public class ReplaceCharacter {
	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.length() == 0) {
			return "";
			}
		char c;
		if(input.charAt(0) == c1) {
			c = c2;
		}
		else {
			c = input.charAt(0);
		}
		String ans = replaceCharacter(input.substring(1), c1, c2);
		return (c + ans);
	}
	

	public static void main(String[] args) {
		
      String str = "aabbcddabbc";
      System.out.println(replaceCharacter(str, 'a', 'x'));
	}

}
