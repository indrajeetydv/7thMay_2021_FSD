public class Example extends Object{
	public static void main(String args[]){
		//null reference variable
		Example ex=null;
		//object ref variable
		Example ex1=new Example();

		System.out.println(ex);//null
		System.out.println(ex1);//Example@hashcode

	}
}