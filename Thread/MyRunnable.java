class MyRunnable implements Runnable{
	@Override
	public void run(){
		for(int i=0;i<10;i++)
			System.out.println(i);
	}

	public static void main(String args[]){
		System.out.println("main method");
		/*MyRunnable t=new MyRunnable();
		Thread t1=new Thread(t);*/
		Thread t1=new Thread(new MyRunnable());
		t1.start();
	}
}

//
/*start(){
	this.run();
}*/