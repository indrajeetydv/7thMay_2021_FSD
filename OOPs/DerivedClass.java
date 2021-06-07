class BaseClass{
	static int a=10;
	int x=20;

	static void m1(){
		System.out.println("m1 method");
	}

	void m2(){
		System.out.println("m2 method");	
	}
}

public class DerivedClass extends BaseClass{

	int z=10;
	public static void main(String[] args){
		System.out.println(a);
		m1();

		DerivedClass dc=new DerivedClass();

		System.out.println(dc.x);
		dc.m2();

		BaseClass bc=new BaseClass();
		System.out.println(dc.z);
		System.out.println(bc.z);
	}
}