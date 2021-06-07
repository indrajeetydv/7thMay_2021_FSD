
interface AccountDaoI{
	/*public static final*/ int a=10;
	/*public abstract */void m1();
}

abstract class AccountDaoImpl implements AccountDaoI{


	
}

class AccountDaoImpl1 implements AccountDaoI{

	public void m1(){
		System.out.println("m1 implementation");
	}	
	
}