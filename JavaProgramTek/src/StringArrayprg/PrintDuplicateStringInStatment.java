package StringArrayprg;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintDuplicateStringInStatment {

	public static void main(String[] args) {
		String s= "welcome to tp welcome to gc18";
		String str []=s.split(" ");
		HashMap<String, Integer> map= new HashMap();
		for(int i=0;i<str.length;i++) {
			String Word=str[i];
			if (map.containsKey(Word)) {
				map.put(Word, map.get(Word)+1);
			}
			else {
				map.put(Word, 1);
			}
	}
		
	
		for (Entry<String, Integer> data : map.entrySet()) {
			if(data.getValue()>1) {
				System.out.print(data.getKey());
				System.out.print(" ");
			}
			
			
		}

	}

}
