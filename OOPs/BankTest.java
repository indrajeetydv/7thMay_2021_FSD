public class BankTest{
	public static void main(String args[]){
		//
		try{
			Bank hdfc_akhil=new Bank("Akhil",111);
			Bank hdfc_venket=new Bank("Venket",222);
			
			//+ve use case
			hdfc_akhil.setBalance(50000);
			System.out.println(hdfc_akhil.getBalance());

			//-ve use case
			System.out.println(hdfc_venket.getBalance());		
		}catch(NumberFormatException nfe){
			System.err.println("please provide only integer value");
		}catch(CustomerValidatonException cve){
			System.err.println("pleas provide proper customer details");
		}
				

	}
}