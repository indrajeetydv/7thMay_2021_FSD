class A11{
	static int a=10;
	int x=20;
}

class B11 extends A11{
	static int a=30;
	int x=40;	

	void m1(){
		System.out.println(super.a);//20
		System.out.println(super.x);//20
	}

	public static void main(String args[]){
		 System.out.println(B11.a);//30
		 System.out.println(A11.a);//10

		 B11 b=new A11();
		 System.out.println(b.a);//30
		 System.out.println(b.x);//40
		 b.m1();		 		 		 
	}
}
