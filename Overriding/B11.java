class A11{
	void m1(){
		System.out.println(" A m1 ");
	}

	void m2(){
		System.out.println(" A m2 ");
		m1();//this.m1()
	}
}

class B11 extends A11{
	void m1(){
		System.out.println(" B m1 ");
	}	

	public static void main(String args[]){
		B11 b=new B11();
		b.m1(); //B m1
		b.m2();//A m2 B m1 

		System.out.println();
		A11 a=new B11();
		a.m1();//B m1
		a.m2();//A m2 B m1
	}
}