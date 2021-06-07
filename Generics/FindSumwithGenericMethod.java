public class FindSumwithGenericMethod{
	/*public static <T extends Number> double genericMethodSum(T  a, T b){
		return a.doubleValue()+b.doubleValue();
	}*/


	public static <T extends Number> double genericMethodSum(T  a, T b){
		return a.doubleValue()+b.doubleValue();
	}

	public static void main(String args[]){
		System.out.println(genericMethodSum(3,14));
		System.out.println(genericMethodSum(3.2f,14.34f));
		System.out.println(genericMethodSum(3.223,14.341));
	}


}