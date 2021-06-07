enum Months{
	JAN(1),FEB(2),MARCH(3);

	private int num;
	Months(int num){
		this.num=num;
	}

	public int getNum(){
		return num;
	}

	public void setNum(int num){
		this.num=num;
	}
}

class YearTest{
	public static void main(String[] args){
		Months[] months=Months.values();
		for(Months month:months){
			System.out.println(month.name());
			System.out.println(month.getNum());
		
		}
	}
}