public class ExecutionFlowNSMembers{
	int x=m1();

	int m1(){
		System.out.println("NSV-x");
		return 10;
	}

	{
		System.out.println("NSB1");
	}

	ExecutionFlowNSMembers(){
		System.out.println("no-args constructor");	
	}

	public static void main(String[] args){
		//2  9 23 27 13
		//main NSV-x NSB-1 NSB2 NSV-y no-args constructor 10 20
		System.out.println("main");	
		ExecutionFlowNSMembers test=new ExecutionFlowNSMembers();
		System.out.println("x: "+test.x);
		System.out.println("y: "+test.y);		
	}

	{
		System.out.println("NSB2");
	}

	int y=m2();

	int m2(){
		System.out.println("NSV-y");
		return 20;
	}

}