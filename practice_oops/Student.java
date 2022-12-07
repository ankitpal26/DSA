package practice_oops;

public class Student {
	public String name;
	private final int rollNo;
	
	private static int numStudent;
	
	public static int getNumStudent() {
		return numStudent;
	}
	
	public Student(String name, int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
		numStudent++;
	}
	
	
	public int geRollNo() {
		return rollNo;
	}
	public void print() {
		System.out.println(name + " : "+ rollNo);
	}

}
