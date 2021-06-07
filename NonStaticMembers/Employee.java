public class Employee{
	int eid;
	String eName;
	String company;

	Employee(int eid, String eName, String company){
		this.eid=eid;
		this.eName=eName;
		this.company=company;
	}

	public String toString(){
		return "eid: "+eid+" eName: "+eName+" company: "+company;
	}

	public static void main(String args[]){
		Employee emp1=new Employee(10,"Akhil","Google");
		Employee emp2=new Employee(20,"Pavan","Google");
		Employee emp3=new Employee(30,"Sai Krishna","Google");

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		



	}
}