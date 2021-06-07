class PrintNumbers{
	void print1To20(){
		for(int i=1;i<=20;i++){
			System.out.print(i +"\t");
			try{
				Thread.sleep(2000);	
			}catch(InterruptedException ie){}	
		}
	}

	void print21To40(){
		for(int i=21;i<=40;i++){
			System.out.print(i +"\t");
			try{
				Thread.sleep(2000);				
			}catch(InterruptedException ie){}
		}
	}
}