import java.util.concurrent.*;
class PowerCalc implements Callable{
	private double number;

	PowerCalc(double number){
		this.number=number;
	}

	public Double call(){
		return Math.pow(number,number);
	}
}

class FactorialCal implements Callable{
	private Long number;

	FactorialCal(long number){
		this.number=number;
	}

	public Long call(){
		long fact=1;
		for(long i=2;i<=number;i++){
			fact*=i;
		}
		return fact;
	}
}

public class CallableMain{
	public static void main(String args[]) throws Exception{
		ExecutorService service=Executors.newFixedThreadPool(4);

		Future powerFuture10=service.submit(new PowerCalc(2));
		Future factorialFuture20=service.submit(new FactorialCal(10));

		System.out.println("Sqare of 10: "+powerFuture10.get());
		System.out.println("Factorial of 20: "+factorialFuture20.get());

		service.shutdown();
	}
}