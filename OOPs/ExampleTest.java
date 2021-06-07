public class ExampleTest{
	public static void main(String[] args){
		Example e=new Example();
		//+ve use case
		e.setA(1000);
		System.out.println(e.getA());
		//-ve use case
		e.setA(-50);
		
	}
}