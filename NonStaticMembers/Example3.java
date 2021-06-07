public class Example3{
	 int a=m1();//2,9,24,38

	 int m1(){
		System.out.println("variable a is created ");
		return 10;
	}

	 int x=100;
	
	 void  m4(){
		System.out.println("x: "+x);
	}

	 int m2(){
		System.out.println("variable b is created ");
		return 20;
	}
	
	 void m5(){
		System.out.println("y: "+y);
	}

	 int y=200;

	 Example3(){
	 	System.out.println("No-arg constructor");
	 }

	public static void main(String[] args){

		System.out.println("main");
		Example3 ex=new Example3();
		System.out.println("a: "+ex.a);
		System.out.println("b: "+ex.b);
	}

	 int b=m2();


	 void m3(){
		System.out.println("m3");
	}
}