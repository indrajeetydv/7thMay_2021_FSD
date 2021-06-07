class DreamCompany{
	String companyName;
	String companyLocation;
	String package;

	DreamCompany(String companyName,String companyLocation,String package){
		this.companyName=companyName;
		this.companyLocation=companyLocation;
		this.package=package;
	}

	public void doDevelopment{
		System.out.println("Doing development");
	}

	public void doTesting{
		System.out.println("Doing testing");
	}

	public void doAutomation{
		System.out.println("Doing automation");
	}

	public void doSupport{
		System.out.println("Doing support work");
	}
}

public class DreamCompanyTest{
	public static void main(String args[]){
		DreamCompany amamzon=new DreamCompany("Amazon","bangalore","30 LPA");
		DreamCompany google=new DreamCompany("Google","hyderabad","50 LPA");
		DreamCompany microsoft=new DreamCompany("Microsoft","bangalore","20 LPA");
	}
}