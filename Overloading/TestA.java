public class TestA{
	void m1(Example e){
		System.out.println("Example args");
	}

	void m1(Sample s){
		System.out.println("Sample args");
	}

	public static void main(String[] args){
		TestA a=new TestA();
		a.m1(new Example());//Example args
		a.m1(new Sample());//Sample args
		//error: no suitable method found for m1(String)
		//a.m1("abc");//m1(string) 
		a.m1(null);// m1(Sample)//Sample args

		System.out.println();
		Example e=new Example();
		Sample s=new Sample();
		Example e2=new Sample();
		Example e1=null;
		Sample s1=null;

		a.m1(e);//Example args
		a.m1(s);//Sample args
		a.m1(e1);//Example args
		a.m1(s1);//Sample args
		a.m1(e2);//m1(Example)//Example args
	}
}

