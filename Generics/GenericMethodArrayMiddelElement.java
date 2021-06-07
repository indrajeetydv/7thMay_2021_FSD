class ArrayMiddleElement{
	public <T> T getMiddle(T... arr){
		return arr[arr.length/2];	
	}
}

public class GenericMethodArrayMiddelElement{
	public static void main(String args[]){
		ArrayMiddleElement obj=new ArrayMiddleElement();
		String str=obj.getMiddle("A","B","C","D","E");
		System.out.println(str);


		Integer result=obj.getMiddle(34,56,74,12);
		System.out.println(result);

	}
}