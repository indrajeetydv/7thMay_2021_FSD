class PrintNumberForm1To20 extends Thread{
	public void run(){
		for(int i=1;i<=20;i++){
			try{
				Thread.sleep(2000);
				System.out.println(i);
			}catch(InterruptedException ie){}
			
		}
	}
}

class PrintNumberForm21To40 extends Thread{
	public void run(){
		for(int i=21;i<=40;i++){
			try{
				Thread.sleep(4000);
				System.out.println(i);
			}catch(InterruptedException ie){}
			
		}
	}
}

public class MultipleThreadExecutionTest{
	public static void main(String args[]){
		System.out.println("main");
		PrintNumberForm1To20 thread1=new PrintNumberForm1To20();
		thread1.start();

		PrintNumberForm21To40 thread2=new PrintNumberForm21To40();
		thread2.start();

		System.out.println("main exited");
	}
}