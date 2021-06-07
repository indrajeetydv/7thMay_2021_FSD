public class GenericClassExample<S,T>{
	S a;
	T b;

	public GenericClassExample(S a, T b){
		this.a=a;
		this.b=b;
	}

	public void show(){
		System.out.println("a= "+a+ "\tb="+b);
	}

	public static void main(String args[]){
		GenericClassExample<Integer,String> obj=new GenericClassExample<Integer,String>(10,"Akira IT");
		obj.show();


		GenericClassExample<String,Boolean> obj1=new GenericClassExample<>("JFSD",true);
		obj1.show();


	}
}