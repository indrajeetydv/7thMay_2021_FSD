import java.util.concurrent.*;

class FetchDataFromFile implements Runnable{
	private final String fileName;

	FetchDataFromFile(String fileName){
		this.fileName=fileName;
	}
	public void run(){
		try{
			System.out.println("Fetching the data from a file: "+fileName+" by " +Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("Read file Successfully: "+fileName+" by " +Thread.currentThread().getName());
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
	}

}

/*public class ThreadPoolExecutordTest{
	public static void main(String[] arg){
		ExecutorService exectorService=Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++){
			FetchDataFromFile fdf=new FetchDataFromFile("file: "+i);
			exectorService.execute(fdf);
		}
		exectorService.shutdown();	

	}
}*/


/*public class ThreadPoolExecutordTest{
	public static void main(String[] arg){
		//Integer.Max
		ExecutorService exectorService=Executors.newCachedThreadPool();
		for(int i=0;i<10;i++){
			FetchDataFromFile fdf=new FetchDataFromFile("file: "+i);
			exectorService.execute(fdf);
		}
		exectorService.shutdown();	

	}
}*/


public class ThreadPoolExecutordTest{
	public static void main(String[] arg) throws InterruptedException{
		//Integer.Max
		ScheduledExecutorService exectorService=Executors.newScheduledThreadPool(3);
		for(int i=0;i<10;i++){
			Thread.sleep(2000);
			FetchDataFromFile fdf=new FetchDataFromFile("file: "+i);
			exectorService.schedule(fdf,5,TimeUnit.SECONDS);
		}
		Thread.sleep(5000);
		exectorService.shutdown();	

	}
}