package dsa_Practice;

public class ReverseWord {
	
	public static String reverseWordWise(String input) {
		int end = input.length();
		int i = input.length()-1;
		String output="";
		while(i >= 0) {
			if(input.charAt(i)==' ') {
				output = output +input.substring(i+1,end)+" ";
				end=i;
						
			}
			i--;
		}
		output += input.substring(i+1,end);
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input = "This is a reverse stirng";
        System.out.println(reverseWordWise(input));
	}

}
