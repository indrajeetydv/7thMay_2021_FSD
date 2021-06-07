class Example5{
	Example5(){
		this(10);//Example5(int)
		System.out.println("no-arg constructor");
	}

	Example5(int a){
		this("abc");//Example5(string)
		System.out.println("int-arg constructor");
	}

	Example5(String str){
		System.out.println("String-arg constructor");
	}

	public static void main(String[] args){
		Example5 e=new Example5();
		//String-arg constructor
		//int-arg constructor
		//no-arg constructor

		Example5 e1=new Example5(10);
		//String-arg constructor
		//int-arg constructor

		Example5 e2=new Example5("java training");
		//String-arg constructor

	}
}

