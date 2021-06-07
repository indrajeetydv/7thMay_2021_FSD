import java.util.*;
public class QueueExample{
	public static void main(String[] args) {
		LinkedList<Integer> queue=new LinkedList<>();

		for(int i=1;i<=10;i++){
			queue.add(i);
		}
		System.out.println("Queue size:  "+queue.size());
		System.out.println("Queue is:  "+queue);
		System.out.println("Removed Fornt is:  "+queue.remove());
		System.out.println("Queue is:  "+queue);
		System.out.println("Head of Queue: "+queue.peek());

		queue.addLast(11);
		System.out.println("Queue size:  "+queue.size());
		System.out.println("Queue is:  "+queue);

	}
}