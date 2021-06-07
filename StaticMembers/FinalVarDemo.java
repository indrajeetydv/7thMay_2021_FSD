public class FinalVarDemo{
	static int a=10;
	final static int b=20;

	int x=30;
	final int y=40;

	public static void main(String[] args){
		int p=80;
		final int q=90;
		//error: cannot assign a value to final variable q
		q=100;
	}
}