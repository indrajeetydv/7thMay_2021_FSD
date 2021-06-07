public class Division1{
	public static void main(String args[]){
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);

			int result=a/b;

			System.out.println("result: "+result);
		}/*catch(NumberFormatException nfe){
			System.out.println("Please pass only interger values");
		}catch(ArithmeticException ae){
			System.out.println("Please DON't pass second value as zero");
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("Please pass atlease two integer value");
		}*/catch(Exception ex){
			System.out.println("Please pass only interger values");
			System.out.println("Please DON't pass second value as zero");
			System.out.println("Please pass atlease two integer value");
		}
		
	}
}