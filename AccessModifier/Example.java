public class Example{
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;

	public static void main(String[] args){
		Example ex=new Example();
		System.out.println("a: "+ex.a);//10
		System.out.println("b: "+ex.b);//20
		System.out.println("c: "+ex.c);//30
		System.out.println("d: "+ex.d);//40
	}

}