package stringsPractice;

public class RemoveConsecutiveDublicates {
	public static String removeConsecutiveDublicates(String str) {
		int n = str.length();
		if(n==0) {
			return str;
		}
		String result="";
		for(int startIndex = 0; startIndex < n; startIndex++) {
			char uniqueChar=str.charAt(startIndex);
			int nextUniqueIndex=startIndex+1;
			if((nextUniqueIndex< n )&&uniqueChar==str.charAt(nextUniqueIndex)) 
			{
				result += uniqueChar;
				startIndex = nextUniqueIndex;
						
			}
		}
		return result;
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbccddeef";
		System.out.println(removeConsecutiveDublicates(str));

	}

}
