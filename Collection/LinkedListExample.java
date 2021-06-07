import java.util.*;

public class LinkedListExample{
	public static void main(String args[]){
		
		List<String> vList=new LinkedList<>(); 

		vList.add("Covaxin");
		vList.add("Covishield");
		vList.add("Pfizer");
		vList.add("SputnikV");
	
		System.out.println("LinkedList Data: "+vList);

		//for loop
		System.out.println("Normal For Loop");
		for(int i=0;i<vList.size();i++){
			System.out.print(vList.get(i)+"\t");
		}

		//forEach
		System.out.println("\nFor Each:");
		//for(<datatype> varName : <Collection>)
		for(String str:vList){
			System.out.print(str+"\t");	
		}

		//Iterate the ArrayList data
		System.out.println("\nIterator:");
		Iterator<String> itr=vList.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}

		//
		System.out.println("\nSplitIterator:");
		Spliterator<String> sitr=vList.spliterator();
		while(sitr.tryAdvance(n->System.out.print(n+"\t")));



		System.out.println();
		sitr=vList.spliterator();
		ArrayList<String> al=new ArrayList<>();
		while(sitr.tryAdvance(n->al.add("AKIRA IT:"+n)));
		
		sitr=al.spliterator();
		sitr.forEachRemaining(n->System.out.print(n+"\t"));





	}
}