package collections_framework;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		Adding string objects in the list1
		list.add("Ravi");
		list.add("Vijay");
		list.add("Aman");
		list.add("Ravi");
		list.add("Ravi");
		
//		Adding integer object in list2
		list2.add(12);
		list2.add(2);
		list2.add(14);
		list2.add(8);
		list2.add(9);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
//		print all elements of list
		System.out.println(list);
//		Traverse using for loop
//		for(String name:list) {
//			System.out.println(name);
//		}
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
//			print every element in separate line
			System.out.println(itr.next());
		}
		System.out.println("Returing element: " +list.get(1));
		list.set(2, "Ram");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
//		Traversing Through list iterator
		System.out.println("Traversing through list itretor");
//		Here , element iterates in reverse order
		ListIterator<String> list1 = list.listIterator(list.size());
		while(list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
        
	}

}
