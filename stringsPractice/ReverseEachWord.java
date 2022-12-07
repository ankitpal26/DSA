package stringsPractice;

public class ReverseEachWord {
	
	public static String reverseEachWord( String str) {
		int n = str.length();
		int prev = -1;
		String ans = "";
		int i = 0;
		
		while(i < n) {
			if(str.charAt(i)==' ') {
				ans += (reverseWord(str, prev+1, i)+ " ");
				prev = i;
				i++;
				
			}
		}
		ans += ans += (reverseWord(str, prev+1, i)+ " ");
		
		return ans;
		
	}
	

	private static String reverseWord(String str, int start, int end) {
		// TODO Auto-generated method stub
			String reverse = "";
			
			while (start < end) {
				reverse = str.charAt(start)+ reverse;
				++start;
			}
			return reverse;		
		}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is reverse String";
		System.out.println(reverseEachWord(str));

	}

}
 