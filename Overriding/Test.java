class Example{
	void m1(){}

	protected void m2(){}

	void m3(){}
}

class Sample extends Example{
	//valid
	//void m1(){}

	//invalid overriding method
	int m1(){}

	//valid
	protected/public void m2(){}

	protected/public void m3(){}
}