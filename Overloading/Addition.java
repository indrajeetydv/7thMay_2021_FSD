class Addition{
	void add(int a,int b){
		System.out.println(a+b);
	}

	void add(float a,float b){
		System.out.println(a+b);
	}

	void add(String str1,String str2){
		System.out.println(str1+str2);
	}

	void add(){
		System.out.println("no-arg add");
	}

	void add(int a){
		System.out.println("int-arg add");	
	}


	void add(String str){
		System.out.println("string-arg add");
	}

/*	int add(String str){
		System.out.println("string-arg add with return type");
		return 10;
	}*/

	public static void main(String[] args){
		Addition test=new Addition();
		test.add(10,20);
		test.add(10.0f,20.0f);
		test.add("abc","def");
		//
		test.add();
		test.add(10);
		test.add("abc");
	}
}



