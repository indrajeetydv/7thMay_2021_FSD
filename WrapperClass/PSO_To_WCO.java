public class PSO_To_WCO{
	public static void main(String[] args){

		Integer i=new Integer("20");
		Integer i1=Integer.valueOf("30");

		System.out.println("i: "+i);//20
		System.out.println("i1: "+i1);//30


		//NumberFormatException: For input string: "5.4"
		//Integer i2=Integer.valueOf("5.4");
		//NumberFormatException: For input string: "5L"
		//Integer i3=Integer.valueOf("5L");
		//
		Float f=Float.valueOf("5.4f");
		Double d=Double.valueOf("5.4");
		System.out.println("f: "+f);//20
		System.out.println("d: "+d);//30
		
		//5L

		
		////suffix "l" and "L" values are not permitted inside String input and throw NumberFormatException.
		//Long l=Long.valueOf("5L");
		Long l1=Long.valueOf(5L);
		System.out.println("l: "+l);//5L
		
		//java.lang.NumberFormatException: Value out of range.
		//Byte b=Byte.valueOf("128");
		// java.lang.NumberFormatException: For input string: "akhil"
		//Integer i2=Integer.valueOf("akhil");








	}
}