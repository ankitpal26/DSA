package collections_framework;
import java.util.*;
public class ArrayList2 {

	public static void main(String[] args) {
		Student s1 = new Student( 1,"Ravi",18);
		Student s2 = new Student(2, "Aman", 19);
		Student s3 = new Student(3, "Shivam", 20);
//		Creating ArrayList
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);//adding student object
		list.add(s2);
		list.add(s3);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}
  
	}

}
