abstract class Test{
     //abstract method
	 abstract void m1();
	 //normal class members
	 Test(){
	 	System.out.println("Test class constructor");
	 }
	 int a=10;
	 static int b=20;
	 void m2(){
	 	System.out.println("Test m2");
	 }

	 static void m3(){
	 	System.out.println("Test m3");
	 }
	 static{
	 	System.out.println("Test class SB");
	 }
	 {
	 	System.out.println("Test class NSB");
	 }
}


abstract class Test2{
	void m1(){
	 	System.out.println("Test2 m1");
	 }
}

class Test1 extends Test{
	@Override
	void m1(){
		System.out.println("Test1 sub class");
	}

	public static void main(String args[]){
		//Test t=new Test();

		//
		Test t=new Test1();
	}
}