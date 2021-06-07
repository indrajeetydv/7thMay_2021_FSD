enum Months{
	JAN,FEB,MARCH;
}

enum Status{
	ACTIVE,INPROGRESS,FAILED,SUCCESS;
}

class Year{
	public static void main(String[] args){
		/*System.out.println(Months.JAN);//JAN
		System.out.println(Months.FEB);//FEB

		System.out.println(Status.ACTIVE);//active
		System.out.println(Status.INPROGRESS);//inprogress
*/
		Status[] statusTest=Status.values();
		for(Status status:statusTest){
			System.out.println(status.name());
		
		}
	}	
}