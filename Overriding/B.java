class A{
	static void m1(int a,int b){
		System.out.println("super class m1");
	}
}

class B extends A{
	static void m1(int a,int b){
		System.out.println("sub class m1");
	}

	public static void main(String args[]){
		B.m1(10,20);
		A.m1(10,20);
	}
}

