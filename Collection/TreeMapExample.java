import java.util.*;
public class TreeMapExample{
	public static void main(String[] args) {
		TreeMap<String,Double> tMap=new TreeMap<>();
		tMap.put("Java",32.00);
		tMap.put("Python",45.00);
		tMap.put("R",46.00);
		tMap.put("ML",48.00);
		tMap.put("AI",60.00);

		System.out.println("map entries are: "+tMap);

		for (Map.Entry<String,Double> entry:tMap.entrySet() ) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

		System.out.println("**********================**************");
		//can we null value
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(null,"Java");
		System.out.println(hm.get(null));

		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(null,"Java");
		System.out.println(lhm.get(null));


		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(null,"Java");
		System.out.println(tm.get(null));
	}
}