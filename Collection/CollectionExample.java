import java.util.*;

public class CollectionExample{
	public static void main(String args[]){
		//ArrayList<String> courses=new ArrayList<>(); 

		List<String> courses=new ArrayList<>(); 

		//List courses=new ArrayList(); 

		courses.add("Java");
		courses.add("Angular");
		courses.add("React");
		courses.add("Dev Ops");
		courses.add("ML");
		courses.add("Automation");
		courses.add("Python");
		//dublicate data
		courses.add("Java");
		courses.add("Angular");
		courses.add("React");

		System.out.println("ArrayList Data: "+courses);

		//Iterate the ArrayList data
		Iterator<String> itr=courses.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}


	}
}