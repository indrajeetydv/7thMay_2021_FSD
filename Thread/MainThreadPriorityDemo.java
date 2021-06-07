class MyPriorityThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			//Thread.yield();
			System.out.print(i+"\t");
		}
	}
}

public class MainThreadPriorityDemo{
	public static void main(String args[]) throws InterruptedException{
		//custom THread
		MyPriorityThread mpt=new MyPriorityThread();
		mpt.setPriority(10);
		
		mpt.start();
		//custom thread and main thread
		mpt.join();
		//Main Thread
		for(int i=11;i<=20;i++){
			System.out.print(i+"\t");
		}
	}
}