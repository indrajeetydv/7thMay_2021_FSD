public class Calculator{
	int add(int a, int b){
		return a+b;
	}

	int add(int a, int b,int c){
		return a+b+c;
	}

	int add(int a, int b,int c,int d){
		return a+b+c+d;
	}

	public static void main(String args[]){
		Calculator venkat=new Calculator();
		System.out.println(venkat.add(10,20));
		System.out.println(venkat.add(10,20,30));
		System.out.println(venkat.add(10,20,30,40));
	}
}