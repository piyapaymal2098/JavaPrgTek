package IntegerArray;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintDuplicateElement {

	public static void main(String[] args) {
		int a[]= {1,1,2,3,4,1,5,3,1};
		HashMap<Integer, Integer> map= new HashMap();
		for(int i=0;i<a.length;i++) {
			int element=a[i];
			if (map.containsKey(element)) {
				map.put(element, map.get(element)+1);
			}
			else {
				map.put(element, 1);
			}
	}
		
	
		for (Entry<Integer, Integer> data : map.entrySet()) {
			if(data.getValue()>1) {
				System.out.print(data.getKey());
				System.out.print(" ");
			}
			
			
		}

	}

}
