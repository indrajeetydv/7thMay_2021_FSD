class Display1{
	//class level lock
	public synchronized static void m1(String str){
	 	for(int i=0;i<5;i++){
			System.out.println("Custom Thread: "+str);
		}
	}

}


class MyThread22 extends Thread{
	String name;
	MyThread22(String str){
		name=str;
	}
	public void run(){
		Display1.m1(name);
	}
}

public class SynchronizationClassLevelLockDemo{
	public static void main(String args[]){
		MyThread22 mt=new MyThread22("akhil");
		MyThread22 mt1=new MyThread22("sai krishna");
		mt.start();
		mt1.start();
	}
}
