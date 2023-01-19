package dsa_Practice;

public class One2100WithoutLoop {
	public static void print(int n) {
		if(n>0) {
			print(n-1);
			System.out.print(n+ " ");
		}
	}
public static void main(String[] args) {
	print(100);
}
}
