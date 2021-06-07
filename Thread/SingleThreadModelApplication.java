public class SingleThreadModelApplication{
	public static void main(String argss[]){
		PrintNumbers pn=new PrintNumbers();
		long time1=System.currentTimeMillis();
		pn.print1To20();
		System.out.println();
		pn.print21To40();
		long time2=System.currentTimeMillis();
		System.out.println("Time taken to complete both tasks: "+((time2-time1)/1000) +"sec");

	}
}