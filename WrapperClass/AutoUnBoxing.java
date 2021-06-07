public class AutoUnBoxing{
	public static void main(String args[]){
		byte b=new Byte((byte)10);//new Byte((byte)10).byteValue();
		short s=new Short((short)20);//
		int i=new Integer(30);
		long l=new Long(40);
		float f=new Float(50);
		double d=new Double(60);
		char ch=new Character('a');
		boolean b1=new Boolean(true);

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