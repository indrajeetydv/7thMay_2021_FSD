class Example1{
	int a;
	int b;
	Example1(){
		System.out.println("Example1 no-arg");
	}
}

class Sample1 extends Example1{
	int x;
	int y;
	Sample1(){
		System.out.println("Sample1 no-arg");
		//CTE: super call must be first statement in constructor
		//super();
	}
}