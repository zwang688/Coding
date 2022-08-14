import java.util.*;
public class Stack {
	public static void main(String[] args) {
		java.util.Stack<Integer> s = new java.util.Stack();
		if(!s.isEmpty()) s.peek();
		if(!s.isEmpty()) s.pop();
		
		s.push(1);
		
		System.out.println(s.peek());
		System.out.println(s.pop());
	}
}
