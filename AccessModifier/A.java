package p1;

public class A{
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;

	public static void main(String[] args){
		A test=new A();
		System.out.println("a: "+test.a);//10
		System.out.println("b: "+test.b);//20
		System.out.println("c: "+test.c);//30
		System.out.println("d: "+test.d);//40
	}

}