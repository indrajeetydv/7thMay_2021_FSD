public class WithoutGenericMehtodSquare{
	
	public static double getSqr(double number){
		return number*number;
	}

	public static void main(String args[]){
		System.out.println("Result: "+getSqr(12));

		//System.out.println("Result: "+getSqr("abc"));
	}
}