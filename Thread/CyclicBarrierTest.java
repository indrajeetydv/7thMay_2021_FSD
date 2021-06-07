import java.util.concurrent.*;

class DependentTask implements Runnable{
	private CyclicBarrier barrier;
	DependentTask(CyclicBarrier barrier){
		this.barrier=barrier;
	}

	public void run(){
		System.out.println("Initializing Depentdent Service");
		try{
			Thread.sleep(3000);
			System.out.println("Done Initializing Depentdent Service");
			barrier.await();
		}catch(InterruptedException | BrokenBarrierException e){
			e.printStackTrace();
		}
	}
}

public class CyclicBarrierTest{
	public static void main(String[] args) throws InterruptedException{
		ExecutorService service=Executors.newFixedThreadPool(5);
		CyclicBarrier barrier=new CyclicBarrier(3);

		service.submit(new DependentTask(barrier));
		service.submit(new DependentTask(barrier));
		service.submit(new DependentTask(barrier));
		service.shutdown();
		System.out.println("All dependent service initialized");
	}
}