import java.util.concurrent.*;
public class Producer1 implements Runnable{
	BlockingQueue queue;

	Producer1(BlockingQueue queue){
		this.queue=queue;
	}

	public void run(){
		for (int i=0;i<10 ;i++ ) {
			System.out.println("Produced Item: "+i);
			try{
				queue.put("item: "+i);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
	}
}