class ThreadPriorityDemo{
	public static void main(String args[]){
		System.out.println(Thread.currentThread().getPriority());//5

		Thread.currentThread().setPriority(7);
		
		System.out.println(Thread.currentThread().getPriority());//7		
	}
}