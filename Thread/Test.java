class Addition{
	int x,y;
	/*synchronized*/ void  add(int x,int y){
		this.x=x;
		this.y=y;

		int result=this.x+this.y;
		System.out.println("Result: "+result);
	}
}

class Thread1 extends Thread{
	Addition a;
	Thread1(Addition a){
		this.a=a;
	}
	public void run(){
		a.add(20,50);
	}
}

class Thread2 extends Thread{
	Addition a;
	Thread2(Addition a){
		this.a=a;
	}
	public void run(){
		a.add(70,90);
	}
}

class Test{
	public static void main(String args[]){
		Addition a=new Addition();
		/*Thread1 t=new Thread1(a)
		t.start()*/
		new Thread1(a).start();
		new Thread2(a).start();

		//70 160 or 160 70
	}
}

