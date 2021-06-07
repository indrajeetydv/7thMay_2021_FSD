package p1;
public class StaticImportDemo{
	//static member
	public static int a=10;
	//non-static member
	public int x=20;

	//static method
	public static void m1(){
		System.out.println("StaticImportDemo- a: "+a);
	}

	//non-static method
	public void m2(){
		System.out.println("StaticImportDemo- x: "+x);
	}

}