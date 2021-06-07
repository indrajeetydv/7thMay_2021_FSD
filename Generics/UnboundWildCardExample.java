import java.util.*;

public class UnboundWildCardExample{
	public static void show(List<?> L){
		for(Object ob:L)
			System.out.print(ob+"\t");
		System.out.println();

	}

	public static void main(String[] args) {
		

		List<Integer> intergerList=Arrays.asList(23,34,234);
		show(intergerList);


		List<String> stringList=Arrays.asList("AKhil","Venket","sai krishna");
		show(stringList);


	}
}