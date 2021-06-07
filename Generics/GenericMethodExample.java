public class GenericMethodExample{

	public static <T> void genericMethod(T  a, T b){
		System.out.println("a: "+a+" b: "+b);
	}

	public static void main(String args[]){
		genericMethod(34.23f,21.34f);
		genericMethod("AKIRA IT","JFSD");
		GenericMethodExample.<Integer>genericMethod(12,23.23f);
		genericMethod("AKIRA IT",12);
	}
}