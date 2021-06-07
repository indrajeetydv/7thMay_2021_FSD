public class NestedTryExample{
	public static void main(String[] args){
		 try{
		 	int a=Integer.parseInt(args[0]);
			System.out.println("a : "+a);
			int[] x=new int[a];
			System.out.println("Array size: "+x.length);
			/*try{
				int[] x=new int[a];
				System.out.println("Array size: "+x.length);
			}catch(NegativeArraySizeException nase){
				System.out.println("Please pass +ve numbers");
			}*/
			
		 }catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("Please pass atlease one integer value");
		}catch(NumberFormatException nfe){
			System.out.println("Please pass only interger values");
		}catch(NegativeArraySizeException nase){
				System.out.println("Please pass +ve numbers");
			}


	}
}