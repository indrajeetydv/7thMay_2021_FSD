public class ExpressionDemo{
	public static void main(String args[]){
		byte b1=10;
		byte b2=20;
		//CTE: incompatible types: possible lossy conversion from int to byte
		//byte b3=b1+b2;
		//byte b3=10+20;
		//byte b3=int+int;
		//byte b3=int;
		//byte b3=b1+b2;

		byte b3=(byte)(b1+b2);

		System.out.println("Expression Result: "+b3);


		short s1=10;
		short s2=20;
		//CTE: incompatible types: possible lossy conversion from int to short
		short s3=(short)(s1+s2);
		System.out.println("Expression Result: "+s3);



		char c1='a';
		char c2='b';
		//CTE: incompatible types: possible lossy conversion from int to char
		//char c3=c1+c2;
		//char c3='a'+'b';
		//char c3=int+int;
		//char c3=int;
		char c3=(char)(c1+c2);
		System.out.println("Expression Result: "+c3);
	}
}