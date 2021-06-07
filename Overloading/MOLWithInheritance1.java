class Addition{
	void add(int a,int b){
		System.out.println("Additon int,int");
	}

	int add(String s1,String s2){
		System.out.println("Additon String,String");
		return 10;
	}
}
class SubAdd extends Addition{
	float add(float a,int b){
		System.out.println("SubAdd float,int");
		return a+b;
	}

	String add(String s1,double d){
		System.out.println("Additon String,double");
		return s1+d;
	}
}

class MOLWithInheritance1{
	public static void main(String args[]){
		SubAdd s=new SubAdd();
		s.add(10,20);//Additon int,int
		s.add("abc","xyz");//Additon String,String
		s.add("10",20.0);//Additon String,double
		s.add(23.45f,19);//SubAdd float,int
	}
	
}