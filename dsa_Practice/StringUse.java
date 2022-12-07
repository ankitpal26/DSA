package dsa_Practice;

public class StringUse {
	public  static void print(String s) {
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void printPrefix(String str) {
		int n=str.length();
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				for(int k=i; k<=j; k++) {
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr1= {1,2,3};
//		int [] arr2= {1,2,3};
//		
//		if(arr1==arr2) {
//			System.out.println("equal");
//		}else {
//			System.out.println("unequal");
//		}
//		String str1="abc";
//		String str2="abc";
//		
//		if(str1==str2) {
//			System.out.println("equal");
//		}else {
//			System.out.println("unequal");
//		}
//		
		
		String str = "abcde";
		printPrefix(str);
		
//		
//		String str="abcdefgh";
//		str ="abc";
//		str=str+"def";
//		System.out.println(str);
//		System.out.println(str.concat("ghi"));
//		System.out.println(str);
	}

}
