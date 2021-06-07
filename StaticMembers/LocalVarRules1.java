public class LocalVarRules1{

	public static void main(String[] args){
		int a=10;
		System.out.println("a: "+a);
		m1();
	}

	static void m1(){
		//CTE: cannot find symbol
		//System.out.println("a: "+a);
	}
}