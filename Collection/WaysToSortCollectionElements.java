import java.util.*;

class Employee implements Comparable<Employee>{
	protected int id;
	protected String fName;
	protected String lName;

	Employee(int id,String fName,String lName){
		this.id=id;
		this.fName=fName;
		this.lName=lName;
	}

	public String toString(){
		return "["+this.id+" , "+this.fName+" , "+this.lName+"]";
	}

	@Override
	public int compareTo(Employee emp){
		return this.fName.compareTo(emp.fName);
	}
}

class SortByLName implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2){
		return e1.lName.compareTo(e2.lName);
	}
}


class SortByID implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2){
		return e1.id-e2.id;
	}
}

public class WaysToSortCollectionElements{
	public static void main(String[] args) {
		List<String> courses=Arrays.asList("Java","Python","ML","AI","Dev Ops");

		//natural order
		Collections.sort(courses);
		System.out.println(courses);

		//reverse order
		Collections.sort(courses,Collections.reverseOrder());
		System.out.println(courses);

		//
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee(111,"Akhil","Mishra"));
		employees.add(new Employee(222,"sai krishna","Tiwari"));
		employees.add(new Employee(333,"Venket","Singh"));
		employees.add(new Employee(555,"Pavan","Yadav"));
		employees.add(new Employee(777,"Anil","Kumar"));
		employees.add(new Employee(444,"Vikas","Pathak"));

		//natural order
		Collections.sort(employees);
		System.out.println(employees);

		//reverse order
		Collections.sort(employees,Collections.reverseOrder());
		System.out.println(employees);

		//sort based on last name and reverse also
		Collections.sort(employees,new SortByLName());
		System.out.println(employees);
		Collections.sort(employees,new SortByLName().reversed());
		System.out.println(employees);


		//sort based on id and reverse also
		Collections.sort(employees,new SortByID());
		System.out.println(employees);
		Collections.sort(employees,new SortByID().reversed());
		System.out.println(employees);

		//Arrays.sort() vs Collections.sort()
		String[] countryArray={"India","America","Italy","France","Japan","China"};
		Arrays.sort(countryArray);
		//
		for(String country:countryArray){
			System.out.print(country+"\t");
		}

		System.out.println();
		List<String> countries=Arrays.asList(countryArray);
		Collections.sort(countries);
		System.out.println(countries);


	}
}