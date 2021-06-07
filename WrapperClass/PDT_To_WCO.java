public class PDT_To_WCO{
	public static void main(String[] args){

		int i=10;
		//constructor(PDT) or valueOf(PDT)
		Integer io1=new Integer(i);
		Integer io2=Integer.valueOf(i);

		System.out.println("io1: "+io1);//10
		System.out.println("io2: "+io2);//10
	}
}