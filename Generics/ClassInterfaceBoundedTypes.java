public class ClassInterfaceBoundedTypes{
	public static <T extends Number & Comparable> double minArray(T... a){
		T min=a[0];
		for(int i=1;i<a.length;i++){
			if(min.compareTo(a[i])>0)
				min=a[i];
		}
		return min.doubleValue();
	}

	public static void main(String args[]){
		double m=minArray(15,8,3,9,45,12);
		System.out.println(m);

		double m1=minArray(1.5,8.3,9.45,1.2);
		System.out.println(m1);

	}
}