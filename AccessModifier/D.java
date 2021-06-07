package p2;
import p1.A;

//class D is a subclass A 
public class D extends A{
	public static void main(String[] args){
		A test=new A();
		//System.out.println("a: "+test.a);//10
		//System.out.println("b: "+test.b);//20
		//System.out.println("c: "+test.c);//30
		System.out.println("d: "+test.d);//40

		D test1=new D();
		System.out.println("c: "+test1.c);//30
		System.out.println("d: "+test1.d);//40
	}
}