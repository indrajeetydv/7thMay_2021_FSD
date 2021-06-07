class TestE{
	void m1(Object obj){
		System.out.println("Object-arg");
	}

	void m1(Test t){
		System.out.println("Test-arg");
	}

	public static void main(String args[]){
		TestE e=new TestE();
		e.m1("abc");//Object-args, m1(string)//m1(object)
		e.m1(new Test());//test-args,
		e.m1(new Object());//object args,
		e.m1(null);// m1(Object) m1(Test) Test-arg
	}
}