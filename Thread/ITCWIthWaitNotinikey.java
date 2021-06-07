public class ITCWIthWaitNotinikey{
	public static void main(String args[]){
		Factory nike=new Factory();
		new Producer(nike);
		new Consumer(nike);

	}
}