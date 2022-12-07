package stringsPractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ANKIT";
		String str2="Pal";
		String reverse = "";
		String reverse2="";
		for(int i=str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
			
		}
		for(int j=str.length()-1; j>=0; j--) {
			reverse2+=str2.charAt(j);
		}
		System.out.println(reverse);
		System.out.println(reverse2);

	}

}
