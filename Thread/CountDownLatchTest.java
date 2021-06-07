import java.util.concurrent.*;

class DependentService implements Runnable{
	private CountDownLatch latch;
	DependentService(CountDownLatch latch){
		this.latch=latch;
	}

	public void run(){
		System.out.println("Initializing Depentdent Service");
		try{
			Thread.sleep(3000);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("Done Initializing Depentdent Service");
		latch.countDown();
	}
}

public class CountDownLatchTest{
	public static void main(String[] args) throws InterruptedException{
		ExecutorService service=Executors.newFixedThreadPool(5);
		CountDownLatch latch=new CountDownLatch(3);

		service.submit(new DependentService(latch));
		service.submit(new DependentService(latch));
		service.submit(new DependentService(latch));

		latch.await();
		service.shutdown();
		System.out.println("All dependent service initialized");
	}
}