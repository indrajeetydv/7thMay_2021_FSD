public class StaticVarDemo2{
	static int a;

	static void m1(int a){
		//a=a;

		Example.a=a;
		System.out.println(a);//50
	}

	public static void main(String args[]){
		System.out.println(a);//0
		m1(50);
		System.out.println(a);//0

		//0 50 50
	}
}