public class Sqare implements Shape{
	private double l;

	public Sqare(double l){
		this.l=l;
	}

	public void area(){
		System.out.println("Sqare Area: "+ (l*l));
	}

	public void perimeter(){
		System.out.println("Sqare Perimeter: "+ (4*l));
	}
}
