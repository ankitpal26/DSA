package linkedList;

import java.util.Scanner;

public class LinkedListUse {
	

	public static Node<Integer> createLinkedList() {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
		return n1;
			
	}
	
	public static int length(Node<Integer> head) {
		int count=0;
		Node<Integer> temp= head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	public static void print(Node<Integer> head) {
		System.out.println("Print" + head);
		while(head!=null) {
		System.out.println(head.data);
		head = head.next;
		}
		System.out.println();
    
	}
	
	public static Node<Integer> takeInput() {
		
		Node<Integer> head = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if(head==null) {
			head = newNode;
		}else {
			Node<Integer> temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
			data = s.nextInt();
		}
		return head;
	}
	public static void increment(Node<Integer> head) {
		head = new Node<Integer>(100);
		head.data++;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
	
		print(head);
		System.out.println(length(head));
		
//		Node<Integer> n1 = new Node<>(10);
//	     takeInput();
//		print(n1);
//		System.out.println(n1);
//		System.out.println(n1.data);
//		System.out.println(n1.next);
		
//		Node<Integer> head = takeInput();
//		print(head);
//		System.out.println("Main" + head);
		
		// TODO Auto-generated method stub
//		Node<Integer> n1= new Node<>(10);
//		System.out.println(n1);
//		System.out.println(n1.data);
//		System.out.println(n1.next);

	}

}
