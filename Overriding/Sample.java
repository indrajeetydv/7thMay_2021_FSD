class Example{
	//overridden method
	void add(int a, int b){
		System.out.println("Example class add(int, int)");
	}
}

class Sample extends Example{
	//overrinding method
	void add(int a, int b){
		super.add(10,20);
		System.out.println("Sample class add(int, int)");
	}

	public static void main(String args[]){
		Sample s=new Sample();
		s.add(10,20);
	}
}