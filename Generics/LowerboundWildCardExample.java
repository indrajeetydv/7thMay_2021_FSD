import java.util.*;

public class LowerboundWildCardExample{
	public static void addNumbers(List<? super Integer> L){
		for(int i=1;i<=5;i++)
			L.add(i);

		System.out.println("List: "+L);
	}

	public static void main(String[] args) {
		List<Object> objectList=new ArrayList<>();
		addNumbers(objectList);

		List<Integer> intergerList=new ArrayList<>();
		addNumbers(intergerList);


		List<Number> numberList=new ArrayList<>();
		addNumbers(numberList);


		/*List<Double> doubleList=new ArrayList<>();
		addNumbers(doubleList);

*/
	}
}