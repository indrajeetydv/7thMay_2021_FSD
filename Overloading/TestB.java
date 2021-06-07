public class TestB{
	void m1(Example e){
		System.out.println("Example args");
	}

	void m1(Test t){
		System.out.println("Test args");	
	}

	
	public static void main(String[] args){
		TestB a=new TestB();
		a.m1(new Example());//Example arg
		a.m1(new Sample());//m1(Sample)->m1(Example)
		// error: no suitable method found for m1(String)
		//a.m1("abc");
		//CTE: reference to m1 is ambiguous
		//a.m1(null);//m1(Example)  m1(Test)

		System.out.println();
		Example e1=new Example();
		//error: incompatible types: Test cannot be converted to Example
		//Example e2=new Test();
		Test t1=new Test();
		Example e3=null;
		Test t2=null;

		a.m1(e1);//m1(Example)//Example args
		a.m1(t1);//m1(Test)//Test args
		a.m1(e3);//m1(Example)//Example args
		a.m1(t2);//m1(Test)//Test args
	}
}

