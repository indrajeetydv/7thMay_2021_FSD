class Person{
	static int hands=2;
	static int legs=2;
	static int eyes=2;

	String color;
	String name;
	int age;

	Person(String color, String name, int age){
	 this.color=color;
	 this.age=age;
	 this.name=name;
	}

	public void sleep(){

	}

	public void eat(){

	}

	public void run(){

	}
}

public class PersonTest{
	public static void main(String[] args){
		Person akhil=Person("white","akhil",22);
		Person saiKrishan=Person("white","Sai Krishna",22);
	}
}