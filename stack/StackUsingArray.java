package stack;

public class StackUsingArray {
	private int data[];
	private int top;
	
	public StackUsingArray(int capacity) {
		
		data = new int [capacity];
		top = -1;
	}
	public StackUsingArray() {
		data = new int[10];
		top = -1;
		// TODO Auto-generated constructor stub
	}
	public  boolean isEmpty() {
		
		return (top == -1);
	}

	public int size() {
		return top + 1;
	}
	public int top() throws StackEmptyException {
		if(size()== 0) {
			//stackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
    
	public void push(int elem) throws StackFullException {

		if(size() == data.length) {
			//stack full
			StackFullException e = new StackFullException();
			throw e;
			}
		top++;
		data[top]=elem;
	}
	
	public int pop() throws StackEmptyException {
		if(size() == 0) {
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		
		int temp = data[top];
		top--;
		return temp;
	}
}

