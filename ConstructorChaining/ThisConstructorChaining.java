class Example4{

	Example4(int a){
		//this(10,20);//Example4(int,int)
		this(10,20.0f);//Example4(int,float)
		System.out.println("one params constructor");
	}

	Example4(int a,int b){
		this(10,20,30);//Example4(int,int,int)
		System.out.println("two params constructor");
	}

	Example4(int a,int b,int c){
		System.out.println("three params constructor");
	}


	Example4(int a,float b){
		System.out.println("int-float params constructor");
	}


}

public class ThisConstructorChaining{
	public static void main(String[] args){
		Example4 e=new Example4(100);
	}
}