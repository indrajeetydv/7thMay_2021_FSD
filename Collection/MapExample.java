import java.util.*;

public class MapExample{
	public static void main(String[] args) {
		Map<Integer,String> vMap=new HashMap<>();

		vMap.put(1,"SputnikV");
		vMap.put(2,"Covaxin");
		vMap.put(3,"Covishield");
		vMap.put(4,"Pfizer");
		vMap.put(4,"Coronil Kit");


		System.out.println("map entries are: "+vMap);

		for (Map.Entry<Integer,String> entry:vMap.entrySet() ) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}


		//how to remove an entry
		vMap.remove(3);
		vMap.remove(1,"Sputnik");
		vMap.remove(1,"SputnikV");
		System.out.println("map entries are: "+vMap);

	}
}