import java.util.*;

public class InterviewPoint{
	public static void main(String[] args) {
		//convert AL to array
		List<String> aList=Arrays.asList("Java","Python","ML","AI","Dev Ops");

		String[] courses=aList.toArray(new String[aList.size()]);
		for(String course:courses){
			System.out.print(course+"\t");
		}

		//convert array to AL
		String[] strArray={"Akira","IT","Solutions"};
		List<String> list=Arrays.asList(strArray);
		System.out.println("\nList items: "+list);



		//find the common elements
		List<String> FSDList=new ArrayList<>();
		FSDList.add("Java");
		FSDList.add("Spring");
		FSDList.add("Angular");


		List<String> UIList=new ArrayList<>();
		UIList.add("HTML");
		UIList.add("CSS");
		UIList.add("Angular");


		UIList.retainAll(FSDList);
		System.out.println("UI List of COurses: "+UIList);


	}
}