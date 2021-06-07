public class Example1{
	static int a=10;
	static int b=20;

	int x=30;
	int y=40;

	void m1(){
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String args[]){
		//1st way-> its class name directly
		System.out.println(a);
		System.out.println(b);

		//2nd way-> using class name
		System.out.println(Example1.a);
		System.out.println(Example1.b);

		//3rd way-> using object reference variable
		Example1 ex=new Example1();
		System.out.println(ex.a);
		System.out.println(ex.b);

		//4th way-> using null reference variable
		Example1 ex1=null;
		System.out.println(ex1.a);
		System.out.println(ex1.b);



		//
		System.out.println(ex.x);
		System.out.println(ex.y);

		//RTE: null pointer exception
		//System.out.println(ex1.x);
		




	}
}