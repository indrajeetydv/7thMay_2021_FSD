interface VehicalI{
	void engine();
	void breaks();
}

abstract class BusImpl implements VehicalI{
	public void breaks(){
		System.out.println("Bus has two breaks");
	}
}

class RedBus extends BusImpl{
	public void engine(){
		System.out.println("Redbus engine capacity is 40kmph");
	}
}

class VolvoBus extends BusImpl{
	public void engine(){
		System.out.println("Redbus engine capacity is 110kmph");
	}
}

public class Driver{
	public static void main(String args[]){
		VehicalI v=new RedBus();
		VehicalI v1=new VolvoBus();

		v.breaks();
		v.engine();

		v1.breaks();
		v1.engine();

	}
}