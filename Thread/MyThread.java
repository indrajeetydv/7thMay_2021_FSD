class MyThread extends Thread{
	//Task
	public void run(){
		for(int i=0;i<10;i++)
			System.out.println(i);
	}

	public static void main(String args[]){
		System.out.println("main method");
		MyThread t=new MyThread();
		//t.start();
		t.run();
	}
}

//
/*start(){
	this.run();
}*/