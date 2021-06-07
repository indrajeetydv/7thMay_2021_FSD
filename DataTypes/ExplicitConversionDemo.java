public class ExplicitConversionDemo{
	public static void main(String args[]){
		
		int i=254;
		//int-> 4 byte,  byte->1 byte
		//1111 1110
		//2's complement-> 0000 0010
		//-2

		//short to identify the result
		//minRange+[result-maxRange-1]
		//-128+[254-127-1]
		//-128+[254-128]
		//-128+126
		//-2
		byte b=(byte)i;//-128 to 128

		System.out.println("Integer value: "+i);
		System.out.println("byte value: "+b);
	}
}