import java.util.*;
public class ArrayListDemo{
	public static void main(String[] args) {
		//create the AL object
		ArrayList<String> courses=new ArrayList<>();
		
		//
		System.out.println("is AL is emplty: "+ courses.isEmpty());//true

		//adding data
		courses.add("Java");
		courses.add("C++");
		courses.add("Angular");
		courses.add("React");
		courses.add("Dev Ops");
		courses.add("ML");
		courses.add("Automation");
		courses.add("Python");

		System.out.println("After insertion List: "+courses);
		System.out.println("is AL is emplty: "+ courses.isEmpty());//false

		//remove data from list
		courses.remove("Java");

		System.out.println("List now: "+courses);//[C++,Angular,React,Dev Ops, ML, AUtomation, Python]

		//remove based on index
		courses.remove(0);
		System.out.println("List now: "+courses);// [Angular, React, Dev Ops, ML, Automation, Python]

		//insert data at particular index
		courses.add(2,"AI");
		System.out.println("List now: "+courses);// [Angular, React, AI,Dev Ops, ML, Automation, Python]

		//clearing all
		courses.clear();
		System.out.println("is AL is emplty: "+ courses.isEmpty());//true
		System.out.println("List now: "+courses);

	}
}