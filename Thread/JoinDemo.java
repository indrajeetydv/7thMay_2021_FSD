public class JoinDemo extends Thread{
		static JoinDemo jd1;
		static JoinDemo jd2;
		public void run(){
			
			for(int i=1;i<=5;i++){	
				try{
					if(getName().equals("Venkat")){
						//venket should wait
						jd1.join();
					}
					if(getName().equals("Sai Krishna")){
						//Sai Krishna wait
						jd2.join();
					}
					Thread.sleep(1000);
				}catch(InterruptedException ie){
					ie.printStackTrace();				
				}
				System.out.println(getName()+":"+i);
			}


		}

		public static void main(String args[]) throws InterruptedException{
			System.out.println("Main Thread is started");
			
			jd1=new JoinDemo();
			jd1.setName("AKhil");
			jd1.start();
			

			jd2=new JoinDemo();
			jd2.setName("Venkat");
			jd2.start();

			JoinDemo jd3=new JoinDemo();
			jd3.setName("Sai Krishna");
			jd3.start();

			//main thread is waiting
			jd1.join();
			jd2.join();
			jd3.join();

			System.out.println("Main Thread exited");
		}
}

