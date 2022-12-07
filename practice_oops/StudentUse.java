package practice_oops;

public class StudentUse {
	public static void main(String[] args) {
		
		Student s1 = new Student("Ankit",120);
	    
	    s1.print();
	    
	    Student s2 = new Student("Maa",213);
	    s2.print();
	    
//	    System.out.println(s1.numStudent);
	    System.out.println(Student.getNumStudent());
//	    System.out.println(Student.numStudent);
	   
	}
	

}
