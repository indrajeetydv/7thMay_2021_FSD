class Sample extends Example{
	@Override
	void m1(){
		System.out.println("Sample m1 method");
	}

	public static void main(String[] args){
		Example e=new Sample();
		e.m1();
	}
}