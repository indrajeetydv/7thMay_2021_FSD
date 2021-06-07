class Producer implements Runnable{
	Factory f;

	Producer(Factory f){
		this.f=f;
		new Thread(this).start();
	}

	public void run(){
		int i=1;
		while(i<=10){
			f.produce(i++);
		}
	}
}