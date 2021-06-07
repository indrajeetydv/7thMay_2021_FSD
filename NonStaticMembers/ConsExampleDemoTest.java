//Dev-1
class ConsExampleDemo{
		private ConsExampleDemo(){
			System.out.println("no-arg cons");
		}
}


//Dev-2
class ConsExampleDemoTest{
	public static void main(String[] args){
		// error: ConsExampleDemo() has private access in ConsExampleDemo
		new ConsExampleDemo();
	}
}