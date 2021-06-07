class NegativeSalaryExcep extends Exception{

	public NegativeSalaryExcep(String str){
		super(str);
	}
}

class PositiveSalaryExcep extends Exception{
	public PositiveSalaryExcep(String str){
		super(str);
	}
}

class Trainer{
	public void decideSalary(String str) throws NegativeSalaryExcep,PositiveSalaryExcep,
	NumberFormatException{
		int salary=Integer.parseInt(str);
		if(salary<0){
			throw new NegativeSalaryExcep("Invalid Salary");
		}else{
			throw new PositiveSalaryExcep("valis Salary");
		}
	}
}


public class AkiraItTrainersTest{
	public static void main(String[] args){
		try{
			Trainer test=new Trainer();
			test.decideSalary(args[0]);
		}catch(NegativeSalaryExcep e1){
			System.out.println("Don't sent negative salary");
		}catch(PositiveSalaryExcep e2){
			System.out.println("OK, VALID SALARY");
		}catch(NumberFormatException nfe){
			System.out.println("Please pass only interger values");
		}catch(ArrayIndexOutOfBoundsException ab){
			System.out.println("Please pass atlease one integer value");
		}
		
	}
}