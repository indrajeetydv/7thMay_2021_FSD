public class Sample{
	public static void main(String[] args){
		Example ex=new Example();
		//System.out.println("a: "+ex.a);//CTE:a has private access in Example
		System.out.println("b: "+ex.b);//20
		System.out.println("c: "+ex.c);//30
		System.out.println("d: "+ex.d);//40
	}
}