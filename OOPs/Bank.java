public class Bank{
	private double balance;
	//111
	private int acctNo;
	private String cutName;

	Bank(String name,int acctNo){
		cutName=name;
		this.acctNo=acctNo;
	}

	//setter and getter methods
	//add an amount to a particular account
	public void setBalance(double balance) throws NumberFormatException
	,CustomerValidatonException{
		//add validation logic to check data is correct or not
		
		if(Integer.parseInt(String.valueOf(acctNo))!=111)
		{
			throw new CustomerValidatonException("Customer is not valid");
		}
		if(Double.parseDouble(String.valueOf(balance))>0){
			this.balance=balance;
		}
	}

	//somebody wants to get your acct balane
	public double getBalance() throws CustomerValidatonException{
		//add validation logic, if needed
		if(acctNo!=111){
			throw new CustomerValidatonException("Customer is not valid");
		}
		return balance;

	}

	public void setCustName(String cutName){
		this.cutName=cutName;
	}
}