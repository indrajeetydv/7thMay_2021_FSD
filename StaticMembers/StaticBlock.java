public class StaticBlock{
	static{
		System.out.println("SB1");
	}
	static{
		System.out.println("SB4");
	}


	public static void main(String args[]){
		System.out.println("main method");
	}


	static{
		System.out.println("SB2");
	}

	static{
		System.out.println("SB3");
	}

}