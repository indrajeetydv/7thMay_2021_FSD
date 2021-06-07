import java.util.*;
public class LinkedListIteratorExample1{
	public static void main(String[] args) {
		LinkedList<String> courses=new LinkedList<>();
		courses.add("Java");
		courses.add("C++");
		courses.add("Angular");
		

		//-1 0 1 2 
		// System.out.println("\n********=============******************");
		// for(int i=litr.previousIndex();i<litr.nextIndex();i++){
		// 	System.out.print(litr.next()+"\t");
		// }

		ListIterator<String> litr=courses.listIterator();
		while(litr.nextIndex()!=courses.size())
		{
			System.out.print(litr.next()+"\t");
		}



	}
	
}