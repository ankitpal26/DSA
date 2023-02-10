package collections_framework;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
//		Adding objects in the list
		list.add("Ravi");
		list.add("Vijay");
		list.add("Aman");
		list.add("Ravi");
		list.add("Ravi");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
        
	}

}
