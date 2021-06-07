import java.util.*;

public class LinkedHashMapExample{
	public static void main(String[] args) {
		Map<String,Double> vMap=new HashMap<>();

		vMap.put("Java",32.00);
		vMap.put("Python",45.00);
		vMap.put("R",46.00);
		vMap.put("ML",48.00);
		vMap.put("AI",60.00);


		System.out.println("map entries are: "+vMap);

		for (Map.Entry<String,Double> entry:vMap.entrySet() ) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}


		Map<String,Double> lMap=new LinkedHashMap<>();
		lMap.put("Java",32.00);
		lMap.put("Python",45.00);
		lMap.put("R",46.00);
		lMap.put("ML",48.00);
		lMap.put("AI",60.00);


		System.out.println("map entries are: "+lMap);

		for (Map.Entry<String,Double> entry:lMap.entrySet() ) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}



	}
}