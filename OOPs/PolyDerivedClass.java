class PolyBaseClass{
	void m1(){
		System.out.println("PolyExample m1");
	}

	void m2(){
		System.out.println("PolyExample m2");
	}
}

public class PolyDerivedClass extends PolyBaseClass{
	//Overridden methods
	void m1(){
		System.out.println("PolyDerivedClass m1");
	}


	public static void main(String[] args){
		//akhil is staying in his own house
		PolyDerivedClass derObj=new PolyDerivedClass();
		//when a method is invoked, if its definition which is bind at compilation time 
		//by compiler is only executed by JVM at runtime, then it is called compile-time polymorphism.
		derObj.m1();//PolyDerivedClass m1-> CP
		derObj.m2();//PolyExample m2->CP

		//akhil is staying in his father house
		PolyBaseClass derObj1=new PolyDerivedClass();	
		//when a method is invoked, if its definition which is bind at compilation time by compiler is no executed by JVM at run-time, 
		//instead if it is executed from the subclass based on the object stored in the reference variable is called run-time polymorphism
		derObj1.m1();//PolyDerivedClass m1->RP
		derObj1.m2();//PolyExample m2->CP

	}

}
