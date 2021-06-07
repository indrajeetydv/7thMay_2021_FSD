import java.util.*;
public class StackExample{
	public static void main(String[] args) {
		LinkedList<Integer> stack=new LinkedList<>();

		for(int i=1;i<=10;i++){
			stack.add(i);
		}

		System.out.println("Stack now: "+stack);
		System.out.println("Stack size: "+stack.size());
		System.out.println("Top element: "+stack.peek());
		
		stack.addFirst(32);
		System.out.println("Top element: "+stack.peek());
		System.out.println("Stack size: "+stack.size());
		System.out.println("Stack now: "+stack);
		
		stack.remove();
		System.out.println("Stack size: "+stack.size());
		System.out.println("Stack now: "+stack);
	}
}