public class ImplicitConversionDemo{
	public static void main(String args[]){
		
		int a=20;
		//int-> 4 byte, long-> 8 byte
		long l=a;

		System.out.println("Integer value: "+a);
		System.out.println("Long value: "+l);
	}
}