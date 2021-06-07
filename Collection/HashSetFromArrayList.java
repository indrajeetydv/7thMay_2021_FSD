import java.util.*;

public class HashSetFromArrayList{
	public static void main(String[] args) {
		ArrayList<String> countries=new ArrayList<>();
		countries.add("India");
		countries.add("America");
		countries.add("New York");
		countries.add("China");
		countries.add("Japan");
		countries.add("Italy");
		countries.add("China");
		countries.add("Japan");

		System.out.println("countries: "+countries);

		HashSet<String> hcountries=new LinkedHashSet<>(countries);

		System.out.println("countries: "+hcountries);

		Iterator<String> itr=hcountries.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}


	}
}