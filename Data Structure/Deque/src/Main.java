import java.util.*;
public class Main {
	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.offerLast(1);
		System.out.println(stack.toString());
		stack.offerLast(2);
		System.out.println(stack.toString());
		stack.offerLast(3);
		System.out.println(stack.toString());
		stack.offerLast(4);
		System.out.println(stack.toString());
		stack.offerLast(5);
		System.out.println(stack.toString());
		
		System.out.println(stack.peekLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.toString());

		System.out.println(stack.peekLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.toString());

		System.out.println(stack.peekLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.toString());

		System.out.println(stack.peekLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.toString());

		System.out.println(stack.peekLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.toString());

		System.out.println(stack.peekLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.toString());
		
		Deque<Integer> queue = new ArrayDeque<>();
		queue.offerLast(1);
		System.out.println(queue.toString());
		queue.offerLast(2);
		System.out.println(queue.toString());
		queue.offerLast(3);
		System.out.println(queue.toString());
		queue.offerLast(4);
		System.out.println(queue.toString());
		queue.offerLast(5);
		System.out.println(queue.toString());

		System.out.println(queue.pollFirst());
		System.out.println(queue.peekFirst());
		System.out.println(queue.toString());
		
		System.out.println(queue.pollFirst());
		System.out.println(queue.peekFirst());
		System.out.println(queue.toString());
		
		System.out.println(queue.pollFirst());
		System.out.println(queue.peekFirst());
		System.out.println(queue.toString());
		
		System.out.println(queue.pollFirst());
		System.out.println(queue.peekFirst());
		System.out.println(queue.toString());
		
		System.out.println(queue.pollFirst());
		System.out.println(queue.peekFirst());
		System.out.println(queue.toString());
		
		System.out.println(queue.pollFirst());
		System.out.println(queue.peekFirst());
		System.out.println(queue.toString());
	}
}
