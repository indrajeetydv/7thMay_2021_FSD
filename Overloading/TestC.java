class TestC{
	void m1(Object obj){
		System.out.println("Object args");
	}

	void m1(Example e){
		System.out.println("Example args");
	}

	void m1(Sample s){
		System.out.println("Sample args");
	}

	/*void m1(Test t){
		System.out.println("Test args");	
	}
*/
	public static void main(String[] args){
		TestC c=new TestC();
		c.m1(new Example());//m1(Example)=> Example args
		c.m1(new Sample());//m1(Sample)=> Sample args
		c.m1("abc");//m1(String),m1(Object)=> Object args
		c.m1(new Test());//m1(Test),m1(Object)=> Test args=>Object args

		System.out.println();
		//CTE: ambibuous error
		//c.m1(null);//m1(Sample) m1(Test) 
		c.m1(null);//m1(Sample)=>Sample args
		c.m1((Sample)null);//m1(Sample)=>Sample args
		c.m1((Test)null);//m1(Test)=> Test args=>Object args

	}
}

