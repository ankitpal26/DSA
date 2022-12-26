package stringsPractice;

public class PracticeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("Ankit");
		StringBuffer sb2 = new StringBuffer("Ankit");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.compareTo(sb2));
	   System.out.println(sb2.append(3));
         
	}

	

}