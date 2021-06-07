public class Example6{
	int x=40;
	int y=50;

	void m1(/*final Example6 this*/){
		x=80;
		y=90;
		this.x=x;
		this.y=y;

	}

	void printXY(/*final Example6 this*/){
		System.out.println(x);
		System.out.println(y);
		m1();//this.m1();

		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String args[]){
		Example6 ex=new Example6();
		ex.printXY();
	}
}