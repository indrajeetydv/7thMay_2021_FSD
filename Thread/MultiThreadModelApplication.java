public class MultiThreadModelApplication extends Thread{
	static PrintNumbers pn=new PrintNumbers();
	public void run(){
		pn.print1To20();
	}
	
	public static void main(String argss[]){
		MultiThreadModelApplication mta=new MultiThreadModelApplication();
		long time1=System.currentTimeMillis();
		//custome thread will print 1-20
		mta.start();

		//main thread will print 21-40
		pn.print21To40();
		
		long time2=System.currentTimeMillis();
		System.out.println("Time taken to complete both tasks: "+((time2-time1)/1000) +"sec");

	}
}