class TypeName<T>{
	
	T a;

	TypeName(T a){
		this.a=a;
	}

	String showtype(){
		return a.getClass().getName();
	}
}

public class ShowTypeName{
	public static void main(String[] args) {
		TypeName<String> strObj=new TypeName<>("Akira IT");
		System.out.println(strObj.showtype());
		TypeName<Integer> intObj=new TypeName<>(20);
		System.out.println(intObj.showtype());

	}
}