public class AutoBoxing{
	public static void main(String args[]){
		Byte b=40;//Byte b=Byte.valueOf((byte)40);
		Short s=50;//Short s=Short.valueOf((short)50);
		Integer i=60;//Integer i=Integer.valueOf(60);
		Long l=70L;//Long l=Long.valueOf(70L);
		Float f=123.45f;//Float f=Float.valueOf(123.45f);
		Double d=90D;//Double d=Double.valueOf(90D);
		Character ch='c';//Character ch=Character.valueOf('c');
		Boolean b1=true;//Boolean b1=Boolean.value(true);


		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(b1);
	}
}