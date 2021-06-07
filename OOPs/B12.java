class A12{
	static int a=10;
	int x=20;

	static void m1(){
		System.out.println("A class m1");
	}
	void m2(){
		System.out.println("A class m2");	
	}
	void m3(){
		System.out.println("A class m3");
	}
}

class B12 extends A12{
	static int a=50;
	int x=60;
	static void m1(){
		//error: non-static variable super cannot be referenced from a static context
		//super.m1();//
		System.out.println("B class m1");
	}
	void m2(){
		System.out.println("B class m2");	
		super.m2();//
	}
	void m4(){
		System.out.println(super.a+"......."+a);//10 50
		System.out.println(super.x+"......."+x);//20 60
		super.m1();//A class m1
		m1();//B class m1
		super.m2();//A class m2
		m2();//B class m2 A class m2
	}

	public static void main(String[] args){
		B12 b=new B12();
		b.m4();
	}
}