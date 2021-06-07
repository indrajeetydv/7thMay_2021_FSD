public class Rectangle implements Shape{
	private double l;
	private double h;

	public Rectangle(double l,double h){
		this.l=l;
		this.h=h;
	}

	public void area(){
		System.out.println("Rentagle Area: "+ l*h);
	}

	public void perimeter(){
		System.out.println("Rentagle Perimeter: "+ 2*(l+h));
	}
}
