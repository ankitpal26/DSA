package linkedList;

import java.util.Scanner;

public class ReverseLL2 {
	
	public static DoubleNode reverseLLBetter(Node<Integer> head) {
		if(head == null || head.next == null) {
		   DoubleNode ans = new DoubleNode();
		   ans.head = head;
		   ans.tail = head;
		   return head;
		}
		
		DoubleNode smallAns =reverseLLBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		
		DoubleNode ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;
	}
	public static void print(Node<Integer> head) {
//		System.out.println("Print" + head);
		while(head!=null) {
		System.out.print(head.data+" ");
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		DoubleNode ans = reverseLLBetter(head);
         print(ans.head);
	}

}
