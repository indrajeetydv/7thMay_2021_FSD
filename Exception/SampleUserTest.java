import java.util.*;
//@iyadav has written this logic
class Sample{
	public int division(String a, String b) throws NumberFormatException,
	ArithmeticException{
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		int result=x/y;
		return result;
	}
}

//remaining 4 members can use this methods
public class SampleUserTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value");
		String str1=sc.nextLine();

		System.out.println("Enter sencond value");
		String str2=sc.nextLine();

		Sample sample=new Sample();
		try{
			System.out.println(sample.division(str1,str2));
		}catch(NumberFormatException nfe){
			System.out.println("Please pass only interger values");
		}catch(ArithmeticException ae){
			System.out.println("Please DON't pass second value as zero");
		}
		
	}

}

