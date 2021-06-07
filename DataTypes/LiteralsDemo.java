public class LiteralsDemo{
	public static void main(String[] args){
		//integrals literlas
		//int-datatype, decimalLiteral-> identifier, 1234->literals
		int decimalLiteral=1234;
		int octalLitrals=012345;
		int hexaDecimalLitrals=0x1234;
		int binaryLitrals=0b11100;


		System.out.println("Decimal value: "+decimalLiteral);
		System.out.println("Ocatal value: "+octalLitrals);
		System.out.println("Hexadecimal  value: "+hexaDecimalLitrals);
		System.out.println("Binary value: "+binaryLitrals);


		//floating litrals
		float f=123.45f;
		double d=343.67d;
		char c='a';
		String str="absc";
		boolean bool=true;

		System.out.println("Float value: "+f);
		System.out.println("Double value: "+d);

		System.out.println("character value: "+c);
		System.out.println("string value: "+str);
		System.out.println("boolean value: "+bool);


		float f1=234.678f;
	}
}