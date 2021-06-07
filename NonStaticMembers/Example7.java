public class Example7{

	int x=50;
	int y=70;

	void m1(/*final Example7 this=1010*/ ){
		Example7 ex=new Example7();//2020
		ex.x=10;
		ex.y=20;

		this.x=10;
		this.y=20;
	}

	public static void main(String[] args){
		Example7 ex1=new Example7();//1010
		System.out.println("x: "+ex1.x+" y: "+ex1.y);//50 60 
		ex1.m1();
		System.out.println("x: "+ex1.x+" y: "+ex1.y);//50 60 
	}
}