public class Example8{
	int x=10;
	int y=20;

	void m1(Example8 e/*=2020*/ /*,final Example8 this=1010*/){
		System.out.println("=====******m1***********=========");
		System.out.println("m1 x: "+ x+" m1 y: "+ y);// 10 20 
		//System.out.println("x: "+ this.x+" y: "+ this.y);// 10 20 
		x=30;//this.x=30
		y=40;//this.y=40
		System.out.println("m1 x: "+ x+"m1 y: "+ y);//
		//System.out.println("x: "+ this.x+" y: "+ this.y);//30 40 


		/*System.out.println("x: "+ e.x+" y: "+ e.y);//
		e.x=30;
		e.y=40;
		System.out.println("x: "+ e.x+" y: "+ e.y);//*/	
	}


	public static void main(String[] args){
		System.out.println("=====******main***********=========");
		Example8 e1=new Example8();//1010
		Example8 e2=new Example8();//2020

		System.out.println("e1.x: "+ e1.x+" e1.y: "+ e1.y);// 10 20	
		e1.m1(e2);//1010.m1(2020)
		System.out.println("e1.x: "+ e1.x+" e1.y: "+ e1.y);// 	30 40	
		System.out.println("e2.x: "+ e2.x+" e2.y: "+ e2.y);// 	10 20	

	}
}