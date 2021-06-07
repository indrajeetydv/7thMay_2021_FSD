class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Custom Thread");
		}
		
	}
}

public class THreadJoinDemo{
	public static void main(String[] args) throws InterruptedException{
		MyThread1 t=new MyThread1();
		t.join();
		t.start();

		for(int i=0;i<5;i++){
			System.out.println("Main Thread");
		}

	}
}