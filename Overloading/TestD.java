class TestD{
	void m1(String str){
		System.out.println("String-arg");
	}

	void m1(Test t){
		System.out.println("Test-arg");
	}

	public static void main(String args[]){
		TestD d=new TestD();
		d.m1("abc");//string-arg
		d.m1(new Test());//test -arg
		d.m1(null);//CTE: error: reference to m1 is ambiguous
	}
}