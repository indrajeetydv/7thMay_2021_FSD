import java.util.*;
public class WaysToIterateMap{
	public static void main(String[] args) {
		Map<Integer,String> courseMap=new HashMap<>();
		courseMap.put(1,"Java");
		courseMap.put(2,"Python");
		courseMap.put(3,"ML");
		courseMap.put(4,"AI");
		/*courseMap.put(5,"DevOps");
		courseMap.put(6,"Scala");
		courseMap.put(7,"Hadoop");
		courseMap.put(8,"Spark");
		courseMap.put(9,"R");
*/
		//using entrySet()
		for(Map.Entry<Integer,String> entry:courseMap.entrySet() ) {
			System.out.print("{Key: "+entry.getKey()+" Value: "+entry.getValue()+" }\t");
		}

		//using keySet()
		System.out.println();
		for(Integer key:courseMap.keySet()){
			System.out.print("{Key: "+key+" Value: "+courseMap.get(key)+" }\t");
		}		

		//using iterator through entrySet
		System.out.println();
		Iterator<Map.Entry<Integer,String>> itr=courseMap.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Integer,String> entry=itr.next();
			System.out.print("{Key: "+entry.getKey()+" Value: "+entry.getValue()+" }\t");
		}

		//using iterator through keySet
		System.out.println();
		Iterator<Integer> keyItr=courseMap.keySet().iterator();
		while(keyItr.hasNext()){
			Integer key=keyItr.next();
			System.out.print("{Key: "+key+" Value: "+courseMap.get(key)+" }\t");
		}

		//using based on values()
		System.out.println();
		//System.out.print(courseMap.values());
		for(String value: courseMap.values())	{
			System.out.print("{Key: "+getKey(courseMap,value)+" Value: "+value+" }\t");	
		}

	}

	public static Integer getKey(Map<Integer,String> map,String value){
		for(Map.Entry<Integer,String> entry:map.entrySet()){
			if(entry.getValue().equals(value)){
				return entry.getKey();
			}
		}
		return null;
	}
}