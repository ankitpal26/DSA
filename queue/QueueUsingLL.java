package queue;

public class QueueUsingLL<T> {
   private Node<T> front;
   private Node<T> rear;
   int size;
   
   public QueueUsingLL() {
	   front = null;
	   rear = null;
	   size = 0;
   }
	
   int size() {
	   return size;
   }
   
   public boolean isEmpty() {
	   return (size==0);
	   
   }
   T front() throws QueueEmptyException {
	   if(size == 0) {
		   throw new QueueEmptyException();
	   }
	 return front.data;   
   }
   
   public void enqueue(T element) {
	  Node<T> newNode = new Node<>(element); 
	  if(rear == null) {
		  front = newNode;
		  rear = newNode;
	  }else {
		  rear.next = newNode;
		  rear = newNode;
	  }
	  size++; 
   }
   
   public T dequeue() throws QueueEmptyException {
	   if(size == 0) {
		   throw new QueueEmptyException();
	   }
	   T temp = front.data;
	   front = front.next;
	   if(size==1) {
		   rear = null;
	   }
	   size--;
	   return temp;
   }
   
}
