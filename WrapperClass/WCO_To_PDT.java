public class WCO_To_PDT{
	public static void main(String[] args){
		//WCO
		Integer io2=Integer.valueOf(211);
		//
		int x=io2.intValue();

		System.out.println("x: "+x);//211

		//-128 to 127
		byte b=io2.byteValue();//-45
		short s=io2.shortValue();
		float f=io2.floatValue();
		double d=io2.doubleValue();

		System.out.println("b: "+b);//211
		System.out.println("s: "+s);//211
		System.out.println("f: "+f);//211
		System.out.println("d: "+d);//211
		
		
	}
}