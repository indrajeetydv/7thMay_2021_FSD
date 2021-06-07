public class Example4{
	static int x=10;
	static int y=20;

	int a=30;
	int b=40;

	public static void main(String args[]){
		Example4 ex1=new Example4();
		Example4 ex2=new Example4();

		//use case for static members
		System.out.println("x: "+ex1.x+" y: "+ex1.y);// 10 20
		System.out.println("x: "+ex2.x+" y: "+ex2.y);// 10 20 

		ex1.x=50;
		ex1.y=60;

		System.out.println("x: "+ex1.x+" y: "+ex1.y);// 50 60
		System.out.println("x: "+ex2.x+" y: "+ex2.y);// 50 60



		//use case for non-static members
		System.out.println("a: "+ex1.a+" b: "+ex1.b);//30 40
		System.out.println("a: "+ex2.a+" b: "+ex2.b);// 30 40
		ex1.a=90;
		ex1.b=100;
		System.out.println("a: "+ex1.a+" b: "+ex1.b);//90 100
		System.out.println("a: "+ex2.a+" b: "+ex2.b); // 30 40





	}
}