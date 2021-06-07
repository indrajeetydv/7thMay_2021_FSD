public class CharacterDemo{
	public static void main(String[] args){
		//int i=66;
		//1st  reason: int-> numeric data type and boolean-> non-numeric data type
		//2nd reson: int and boolean incompatiable data type 

		//boolean b=i;
		

		char ch='a';
		char ch1=98;

		//CTE: possible lossy conversion from int to char
		//char ch2=-98;

		System.out.println("ch value: "+ch);//a
		System.out.println("ch1 value: "+ch1);//b

		int i1=65;
		int i2='B';
		System.out.println("i1 value: "+i1);//65
		System.out.println("i2 value: "+i2);//66

		//
		int x=98;
		//CTE: incompatible types: possible lossy conversion from int to char
		//char c=i;
		char c=(char)x;
		System.out.println("integer value: "+x);//98
		System.out.println("character value: "+c);//b



	}
}