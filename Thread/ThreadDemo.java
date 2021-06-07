class ThreadDemo extends Thread{
	public static void main(String args[]){

		System.out.println(Thread.currentThread().getName());
		
		ThreadDemo td=new ThreadDemo();
		System.out.println(td.getName());


		ThreadDemo td1=new ThreadDemo();
		System.out.println(td1.getName());
	
		System.out.println("*********====================*****************");
		Thread.currentThread().setName("Akhil");
		td.setName("Sai Krishna");
		td1.setName("Venket");
		System.out.println(Thread.currentThread().getName());
		System.out.println(td.getName());
		System.out.println(td1.getName());

	}	


}

