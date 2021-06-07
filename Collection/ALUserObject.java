import java.util.*;

class Course{
	private int courseId;
	private String name;
	private int lectureCount;

	Course(int courseId,String name,int lectureCount){
		this.courseId=courseId;
		this.name=name;
		this.lectureCount=lectureCount;
	}

	public String toString(){
		return "["+courseId+" , "+name+" , "+lectureCount+"]";
	}



}


public class ALUserObject{
	public static void main(String[] args) {
			ArrayList<Course> courses=new ArrayList<>();
			courses.add(new Course(1,"Java",25));
			courses.add(new Course(2,"Python",30));
			courses.add(new Course(3,"Angular",10));
			courses.add(new Course(4,"react",15));
			courses.add(new Course(5,"ML",20));

			//for each
			System.out.println("**********======For Each=========************");

			for(Course course:courses){
				System.out.println(course);
			}

			System.out.println("**********======Iterator=========************");
			Iterator<Course> itr=courses.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
	}	
}