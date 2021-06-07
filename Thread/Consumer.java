
class Consumer implements Runnable{
	Factory f;

	Consumer(Factory f){
		this.f=f;
		new Thread(this).start();
	}

	public void run(){
		int i=1;
		while(i<=10){
			f.consume();
			i++;
		}
	}
}