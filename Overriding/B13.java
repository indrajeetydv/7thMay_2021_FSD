class A13{
	static void m1(){
		System.out.println("superclass static m1");
	}
	void m2(){
		System.out.println("superclass m1");
	}

	static void m3(){
		System.out.println("superclass static m3 no-arg");
	}

	void m3(String str){
		System.out.println("superclass string-arg");
	}
}

class B13 extends A13{
	static void m1(){
		System.out.println("subclass static m1");
	}	
	void m2(){
		System.out.println("subclass m2");
	}

	void m3(float f,int i){
		System.out.println("subclass float,int");
	}

	public static void main(String args[]){
		B13 b=new B13();
		b.m1(); //subclass static m1
		b.m2();//subclass m2
		b.m3();//superclass static m3 no-arg
		b.m3("abc");//superclass string-arg
		// error: incompatible types: possible lossy conversion from double to float
		//b.m3(45.5,20);
		b.m3((float)45.5,20);//subclass float,int
		b.m3(45.5f,20);//subclass float,int

		System.out.println();
		A13 a=new B13();
		a.m1(); //superclass static m1
		a.m2();//subclass m2
		a.m3();//superclass static m3 no-arg
		a.m3("abc");//superclass string-arg
		// error: incompatible types: possible lossy conversion from double to float
		//b.m3(45.5,20);
		a.m3((float)45.5,20);//subclass float,int
		a.m3(45.5f,20);//subclass float,int

	}
}