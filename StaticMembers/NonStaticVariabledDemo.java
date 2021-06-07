public class NonStaticVariabledDemo{
	//non-static variable
	int a =10;

	void m1(){
		System.out.println(a);
	}

	public static void main(String[] arsg){
		//CTE: non-static variable a cannot be referenced from a static context
		//System.out.println(a);
		NonStaticVariabledDemo test=new NonStaticVariabledDemo();
		test.m1();
	}

}