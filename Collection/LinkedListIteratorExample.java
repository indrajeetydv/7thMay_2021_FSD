import java.util.*;
public class LinkedListIteratorExample{
	public static void main(String[] args) {
		LinkedList<String> courses=new LinkedList<>();
		courses.add("Java");
		courses.add("C++");
		courses.add("Angular");
		courses.add("React");
		courses.add("Dev Ops");
		courses.add("ML");
		courses.add("Automation");
		courses.add("Python");

		//iterate LL using iterator
		System.out.println("\n********=====Forward Direction========******************");
		Iterator<String> itr=courses.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"\t");
		}
		System.out.println("\n********======Forward Direction=======******************");
		//iterate LL using ListIterator
		ListIterator<String> litr=courses.listIterator();
		while(litr.hasNext()){
			System.out.print(litr.next()+"\t");
		}

		System.out.println("\n********======Backward Direction=======******************");
		while(litr.hasPrevious()){
			System.out.print(litr.previous()+"\t");
		}

		System.out.println("\n********======Backward Direction using decending iterator=======******************");
		Iterator<String> ditr=courses.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.print(ditr.next()+"\t");
		}

		System.out.println("\n********=====Using nextIndex()========******************");
		while(litr.nextIndex()!=courses.size()){
			System.out.print(litr.next()+"\t");
		}

	}
	
}