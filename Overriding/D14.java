class A14{
	void m1(){
		System.out.println("A m1");
	}
	void m2(){
		System.out.println("A m2");
		m1();
	}
}
class B14 extends A14{
	@Override
	void m1(){
		System.out.println("B m1");
	}	

	void m3(){
		System.out.println("B m3");
		m1();
		super.m2();
	}
}
class C14 extends B14{
	void m2(){
		System.out.println("C m2");
		//error: cannot find symbol
		//m4();
	}
}

class D14 extends C14{
	@Override
	void m1(){
		System.out.println("D m1");
	}
	void m2(){
		System.out.println("D m2");
	}
	void m4(){
		System.out.println("D m4");
	}

	public static void main(String args[]){
		D14 d=new D14();
		d.m1();//D m1
		d.m2();// D m2
		d.m3();//B m3, D m1, A m2 ,D m1
		d.m4();//D m4
	}
}