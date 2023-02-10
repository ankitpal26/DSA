package collections_framework;
import java.util.*;
public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Shiv");
		list.add("Om");
       
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ram");
		list2.add("Hanuman");
		list.retainAll(list2);
		System.out.println("iterating the elements after retaining the elements of list2");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<String> list3 = new ArrayList<String>();
		System.out.println("Is ArrayList empty: " + list3.isEmpty());
		list3.add("Ram");
		list3.add("Shiv");
		list3.add("Om");
		System.out.println("Is ArrayList empty: " + list3.isEmpty());
	}

}
