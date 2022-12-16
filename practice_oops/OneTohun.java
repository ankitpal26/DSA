package practice_oops;

public class OneTohun {
	static void printNum(int n) {
		if(n>0) {
			printNum(n-1);
			System.out.println(n + " ");
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       printNum(50);
       
	}

}
