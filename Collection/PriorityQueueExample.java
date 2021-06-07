import java.util.*;
public class PriorityQueueExample{
	public static void main(String[] args) {
		PriorityQueue<String> pCourses=new PriorityQueue<>();
		
		pCourses.add("Java");
		pCourses.add("C++");
		pCourses.add("Angular");
		pCourses.add("React");
		pCourses.add("Dev Ops");
		pCourses.add("ML");
		pCourses.add("Automation");
		pCourses.add("Python");

		//
		System.out.println("Size: "+pCourses.size());//8
		System.out.println("Head: "+pCourses.peek());//

		Iterator<String> itr=pCourses.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}

		System.out.println("\n*********===============************");
		pCourses.remove();
		pCourses.poll();
		pCourses.poll();

		System.out.println("Size: "+pCourses.size());//5
		itr=pCourses.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}

	}
}