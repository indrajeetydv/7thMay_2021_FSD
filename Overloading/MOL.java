class MOL{
	static void m1(int a){
		System.out.println("int-arg");
	}

	static void m1(float f){
		System.out.println("float-arg");
	}

	public static void main(String[] args){
		m1(10);//m1(int)->int-arg
		m1('a');//m1(char)->m1(int)
		m1(50L);//m1(long)->m1(float) m1(double)
		// error: no suitable method found for m1(double)
		//m1(50.24);//m1(double)->

	}
}

//Same type-> widening->Autoboxing->CTE 


