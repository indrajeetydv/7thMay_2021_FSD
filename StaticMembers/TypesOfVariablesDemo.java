public class TypesOfVariablesDemo{
	//class level variables
	//static variables
	static int a=10;
	static int b=20;

	//non-static variables
	int x=30;
	int y=40;

	void m1(){
		//local varibles
		int p=111;
		int q=222;
		System.out.println(p);
		System.out.println(q);
	}

	public static void main(String[] args){
		System.out.println(TypesOfVariablesDemo.a);
		System.out.println(TypesOfVariablesDemo.b);
		//
		TypesOfVariablesDemo demo=new TypesOfVariablesDemo();

		System.out.println(demo.a);
		System.out.println(demo.b);
		//accesing non=static members
		System.out.println(demo.x);
		System.out.println(demo.y);
		//
		demo.m1();



	}
}