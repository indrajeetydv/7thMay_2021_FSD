class Display{
	public synchronized void m1(String str){
	 	for(int i=0;i<5;i++){
			System.out.println("Custom Thread: "+str);
		}
	}

}


class MyThread11 extends Thread{
	Display d;
	String name;
	MyThread11(Display d,String str){
		this.d=d;
		name=str;
	}
	public void run(){
		d.m1(name);
	}
}

public class SynchronizationDemo{
	public static void main(String args[]){
		Display d=new Display();
		MyThread11 mt=new MyThread11(d,"akhil");
		MyThread11 mt1=new MyThread11(d,"sai krishna");
		mt.start();
		mt1.start();
	}
}
