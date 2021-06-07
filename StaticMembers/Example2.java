public class Example2{
	static int a=m1();//2,9,24,32 finally main

	static int m1(){
		System.out.println("variable a is created ");
		return 10;
	}

	static int x=100;
	
	static void  m4(){
		System.out.println("x: "+x);
	}

	static int m2(){
		System.out.println("variable b is created ");
		return 20;
	}
	
	static void m5(){
		System.out.println("y: "+y);
	}

	static int y=200;

	public static void main(String[] args){
		System.out.println("main");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

	static int b=m2();

	static void m3(){
		System.out.println("m3");
	}
}