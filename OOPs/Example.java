class Example{
	private int a;

	//setter and getter

	public void setA(int a){
		if(a>0){
			this.a=a;
		}else{
			System.out.println("Don't pass negative number");
		}
	}

	public int getA(){
		return a;
	}

}

