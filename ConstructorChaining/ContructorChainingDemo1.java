class Example/* extends Object*/{
	int a;
	int b;
	Example(){}
	Example(int a,int b){
		this.a=a;
		this.b=b;
	}
}

class Sample extends Example{
	int x;
	int y;
	Sample(int x,int y){
		super(111,222);
		this.x=x;
		this.y=y;
	}
	
}


public class ContructorChainingDemo1{
	public static void main(String[] args){

		Sample s=new Sample(10,20);
		

		Example e=new Sample(10,20);
		//e.a=50;
		//e.b=80;

		Example e1=new Example(10,20);
		//e1.a=333;
		//e1.b=444;

		System.out.println("x: "+s.x);//10
		System.out.println("y: "+s.y);//20
		System.out.println("a: "+s.a);//111
		System.out.println("b: "+s.b);//222

		s.a=30;
		s.b=40;
		System.out.println("x: "+s.x);//10
		System.out.println("y: "+s.y);//20
		System.out.println("a: "+s.a);//111
		System.out.println("b: "+s.b);//222





	}
}