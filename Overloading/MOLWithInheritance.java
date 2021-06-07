class A{
	void m1(int a){
		System.out.println("super class m1()");
	}
}
class B extends A{
	void m1(float f){
		System.out.println("subclass m1()");
	}

}

class MOLWithInheritance{
	public static void main(String args[]){
		B a=new B();
		a.m1(10);//super class m1()
		a.m1(20.34f);//subclass m1()
	}
	
}