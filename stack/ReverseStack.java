package stack;

import java.util.Stack;

public class ReverseStack {
	public static void reverseStack(Stack<Integer> s1,  Stack<Integer> helper) {
		  
		if(s1.size() <= 1) {
			return ;
		}
		int lastEle= s1.pop();
		reverseStack(s1, helper);
		while(!s1.isEmpty()) {
			int top=s1.pop();
			helper.push(top);
		}
		s1.push(lastEle);
		while(!helper.empty()) {
			int top = helper.pop();
			s1.push(top);
		}
		
		
	}
	public static void main(String[] args) {
		int arr[] = {5,6,7,1,9};
		Stack<Integer> stack = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        
        for(int ele:arr) {
        	stack.push(ele);
        }
        reverseStack(stack, helper);
        while(!stack.empty()) {
        	System.out.println(stack.pop());
        	
        }
	}

}
