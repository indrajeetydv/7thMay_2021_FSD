public class Example1{
	public static void main(String[] args){
		try{
			System.out.println("In try1");	
		}catch(Exception ex){
			System.out.println("In catch1");
		}

		try{
			System.out.println("In try2");	
		}catch(Exception ex){
			System.out.println("In catch2");
		}

		System.out.println("after try/catch/finally");
	}
}