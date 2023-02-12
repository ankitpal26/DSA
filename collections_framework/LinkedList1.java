package collections_framework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
         list.add("Ravi");
         list.add("Vijay");
         list.add("Ravi");
         list.add("Ajay");
         System.out.println(list);
         Iterator<String> itr = list.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }
	}

}
