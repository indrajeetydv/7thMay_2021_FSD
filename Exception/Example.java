public class Example{
	public static void main(String[] args){
		try{
			System.out.println("In try");
			System.out.println(10/0);
		}/*catch(ArithmeticException ex){
			System.out.println("In catch");
		}*/catch(NullPointerException ex){
			System.out.println("In catch");
		}finally{
			System.out.println("In finally");
		}

		System.out.println("after try/catch/finally");
	}
}