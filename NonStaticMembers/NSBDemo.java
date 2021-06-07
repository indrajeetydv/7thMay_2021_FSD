public class NSBDemo{
	{
		System.out.println("NSB");
	}

	NSBDemo(){
		System.out.println("no-arg");
	}

	NSBDemo(String str){
		System.out.println("string args cons");
	}

	public static void main(String[] args){
		System.out.println("main");
		NSBDemo e=new NSBDemo("abc");
	}


}