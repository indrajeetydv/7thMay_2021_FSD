public class StaticVarDemo1{
	static int a=10;//0->50

	static void m1(int x){
		a=x;//50
		System.out.println(a);//50
	}

	public static void main(String args[]){
		System.out.println(a);//0
		m1(50);
		System.out.println(a);//50

		//v-> 0 50 0
		//a-> 0 50 50
		//sk-> 0 50 0 
	}

}