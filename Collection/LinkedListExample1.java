import java.util.*;
public class LinkedListExample1{
	public static void main(String[] args) {
		LinkedList<String> vList=new LinkedList<>();
		vList.add("Covaxin");
		vList.add("Covishield");
		vList.add("Pfizer");
		vList.add("SputnikV");


		System.out.println("Total items: "+vList.size());
		System.out.println("List Items: "+vList);
		Iterator<String> itr=vList.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"\t");
		}

		System.out.println();
		//first element of the LnikedList : getFirst() and getLast()
		System.out.println("First Element: "+vList.getFirst());
		System.out.println("Last Element: "+vList.getLast());

		//remvoe some elemetnts form a LL
		vList.removeFirst();
		vList.removeLast();

		//
		System.out.println("List Items: "+vList);
	}
	
}