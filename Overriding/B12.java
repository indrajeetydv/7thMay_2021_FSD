class A12{
	private void m1(){
		System.out.println("super class m1");
	}

	void m2(){
		System.out.println("super class m2");
		m1();//this.m1()
	}
}

class B12 extends A12{
	//valid
	/*private/protected/public/default  void m1(){
		System.out.println("B12 m1");
	}	*/

	void m1(){
		System.out.println("subclass m1");
	}	
	public static void main(String args[]){
		B12 b=new B12();
		b.m1(); //subclass m1
		b.m2();//superclass m2, subclass m1

		System.out.println();
		A12 a=new B12();
		//m1() has private access in A12
		//a.m1();//B m1
		a.m2();//superclass m2, subclass m1

	}
}