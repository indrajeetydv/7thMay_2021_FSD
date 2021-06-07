class Example3{
	int a;
	int b;

	

	Example3(int a,int b){
		super();
		System.out.println("Example3 no-arg");
	}
}

class Sample3 extends Example3{
	int x;
	int y;
	Sample3(){
		super();
		System.out.println("Sample3 no-arg");
	}
}