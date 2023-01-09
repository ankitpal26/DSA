package stringsPractice;

public class RemoveDublicates {
	public static String removeConsecutiveDublicates(String s) {
		if(s.length() <= 1) {
			return s;
		}
		if(s.charAt(0) == s.charAt(1)) {
			return removeConsecutiveDublicates(s.substring(1));
		}
		else {
			String small = removeConsecutiveDublicates(s.substring(1));
			return s.charAt(0)+small;
		}
	}
	public static void main(String[] args) {
		String str="aabbccddee";
		System.out.println(removeConsecutiveDublicates(str));
	}

}
