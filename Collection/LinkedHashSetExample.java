import java.util.*;
public class LinkedHashSetExample{
	public static void main(String[] args) {
		Set<String> courses=new LinkedHashSet<>();

		courses.add("Java");
		courses.add("Python");
		courses.add("DevOps");
		courses.add("R");
		courses.add("Java");
		courses.add("Python");

		System.out.println("courses: "+courses);

		//
		for(String course:courses){
			System.out.print(course+"\t");
		}

		System.out.println();
		//
		Iterator<String> itr=courses.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}

	}
}