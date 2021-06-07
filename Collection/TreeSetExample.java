import java.util.*;

public class TreeSetExample{
	public static void main(String[] args) {
		TreeSet<Integer> nSet=new TreeSet<>();
		nSet.add(34);
		nSet.add(4);
		nSet.add(19);
		nSet.add(99);
		nSet.add(104);
		nSet.add(24);

		System.out.println("TreeSet Data: "+nSet);//[4, 19, 24, 34, 99, 104]

		TreeSet<String> strSet=new TreeSet<>();
		strSet.add("India");
		strSet.add("America");
		strSet.add("New York");
		strSet.add("China");
		strSet.add("Japan");
		strSet.add("Italy");
		strSet.add("China");
		strSet.add("Japan");

		System.out.println("TreeSet Data: "+strSet);//[America, China, India, Italy, Japan, New York]
	}
}