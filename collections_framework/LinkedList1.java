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
         LinkedList<String> list2 = new LinkedList<String>();
         list2.add("Sumo");
         list2.add("Shivam");
         list.addAll(list2);
         System.out.println(list);
	}

}
