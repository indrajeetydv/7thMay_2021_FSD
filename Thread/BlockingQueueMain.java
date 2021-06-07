import java.util.concurrent.*;
public class BlockingQueueMain{
	public static void main(String args[]){
		BlockingQueue queue=new ArrayBlockingQueue(10);


		Producer1 producer=new Producer1(queue);
		Consumer1 consumer=new Consumer1(queue);

		/*new Thread(producer).start();
		new Thread(consumer).start();*/

		ExecutorService service=Executors.newFixedThreadPool(5);
		service.submit(producer);
		service.submit(consumer);
		service.shutdown();

		//System.out.println("teesting..................");
	}
}