package linkedList;

import generics.Print;

public class ReverseLL {
	
	public static void print(Node<Integer> head) {
//		System.out.println("Print" + head);
		while(head!=null) {
		System.out.print(head.data+" ");
		head = head.next;
		}
		System.out.println();
    
	}
    
    public static Node<Integer> reverseR(Node<Integer> head){
   if(head==null || head.next==null) {
	   return head;
   }
    Node<Integer> finalHead = reverseR(head.next);
    Node<Integer> temp = finalHead;
    while(temp.next != null) {
    	temp = temp.next;
    }
    temp.next = head;
    head.next = null;
    return finalHead;
    }
    public static void main(String[] args) {
		Node<Integer> head= takeInput();
		head = reverseR(head);
	print(head);
	}
  
	private static Node<Integer> takeInput() {
		// TODO Auto-generated method stub
		return null;
	}
}
