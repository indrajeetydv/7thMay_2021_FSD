class ConsExample{
		ConsExample(){
			System.out.println("no-arg cons");
		}

		ConsExample(int x,int y){
			System.out.println("primitive arg cons");
		}

		ConsExample(String str1,String str2){
			System.out.println("string arg cons");
		}

		ConsExample(ConsExample ob1, ConsExample ob2,ConsExample ob3){
			System.out.println("reference type arg cons");
		}

		void ConsExample(){
			System.out.println("non-void method");
		}

		public static void main(String[] args){
			new ConsExample();
			new ConsExample(20,30);
			new ConsExample("abc","def");
			ConsExample t1=new ConsExample();
			ConsExample t2=new ConsExample();
			new ConsExample(t1, t2,t1);
		}
}