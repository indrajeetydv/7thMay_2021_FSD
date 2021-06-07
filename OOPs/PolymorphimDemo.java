public class PolymorphimDemo{
	void m1(){
		//
		int result=10+20;
		System.out.println("result: "+result); 
	}


	void m1(int a, int b){
		//
		int result=a+b;
		System.out.println("result: "+result); 
	}

	public static void main(String args[]){
		PolymorphimDemo obj1=new PolymorphimDemo();
		obj1.m1();
		obj1.m1(40,50);
	}

}