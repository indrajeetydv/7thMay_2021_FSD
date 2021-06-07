public class Example2{

	Example2(){
		System.out.println("No-arg constructor");
	}
	int a=m1();

	int m1(){
		System.out.println("variable a is created ");
		return 10;
	}

	int b=m2();

	int m2(){
		System.out.println("variable b is created ");
		return 20;
	}

	/*Example2(){
		System.out.println("No-arg constructor");
	}*/

	public static void main(String[] args){
		System.out.println("main");
		Example2 ex=new Example2();
		System.out.println("a: "+ex.a);
		System.out.println("b: "+ex.b);
	}


}