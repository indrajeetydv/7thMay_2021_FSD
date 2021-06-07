abstract class Example{
	abstract void m1();

	Example(){
		System.out.println("Exam constructor");
	}

	static int a=10;
	int b=20;

	static{
		System.out.println("Example SB");
	}
	{
		System.out.println("Example NSB");
	}

	static void m2(){
		System.out.println("Example SM");
	}

	void m3(){
		System.out.println("Example NSM");
	}

	public static void main(String[] args){
		System.out.println("Example main");
		System.out.println("a: "+a);
		m2();
/*
		Example ex=new Example();
		ex.m3();*/
	}

}