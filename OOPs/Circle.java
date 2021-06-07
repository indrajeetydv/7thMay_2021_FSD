public class Circle implements Shape{
	//3.14*r*r
	//2*3.14*r
	private double r;
	private static final float PI=3.14f;

	public Circle(double r){
		this.r=r;
	}

	public void area(){
		System.out.println("Rentagle Area: "+ (PI*r*r));
	}

	public void perimeter(){
		System.out.println("Rentagle Perimeter: "+ (2*PI*r));
	}
}
