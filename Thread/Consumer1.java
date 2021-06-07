import java.util.concurrent.*;

public class Consumer1 implements Runnable{
	BlockingQueue queue;

	Consumer1(BlockingQueue queue){
		this.queue=queue;
	}

	public void run(){
		for (int i=0;i<10 ;i++ ) {
			try{
				System.out.println("Consumed Item: "+queue.take());
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
	}
}