import java.util.*;
public class ArrayListSorting{
	public static void main(String[] args) {
		ArrayList<Integer> nList=new ArrayList<>();

		nList.add(34);
		nList.add(4);
		nList.add(54);
		nList.add(104);
		nList.add(14);

		System.out.println("Before Sorting: "+nList);

		//sort the AL data
		Collections.sort(nList);
		System.out.println("After Sorting: "+nList);
	}
}