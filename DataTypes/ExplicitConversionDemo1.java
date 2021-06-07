public class ExplicitConversionDemo1{
	public static void main(String args[]){
		
		long l=10;
		//long->8 byte , int->4 byte
		int i=(int)l;//10 is within the range of the integer//10

		System.out.println("Long value: "+l);//10
		System.out.println("Integer value: "+i);//10
	}
}