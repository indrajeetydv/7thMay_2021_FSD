public class GenericMehtodSquare{
	
	public static <T extends Number> double getSqr(T number){
		return number.doubleValue()*number.doubleValue();
	}

	public static void main(String args[]){
		System.out.println("Result: "+GenericMehtodSquare.<Integer>getSqr(13));
		System.out.println("Result: "+getSqr(12.33f));
	
	}
}

/*
<T> in the method signature implies generic type T.
<> is known as diamon operator
Generic type T is used with argument passed
it is also used with return type
*/