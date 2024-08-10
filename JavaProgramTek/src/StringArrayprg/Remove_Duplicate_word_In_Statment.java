package StringArrayprg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class Remove_Duplicate_word_In_Statment {

	public static void main(String[] args) {
		String s= "welcome to tp welcome to gc18";
		String str []=s.split(" ");
		HashMap<String, Integer> map= new LinkedHashMap<String, Integer>();
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
			
				System.out.print(data.getKey()+" ");
				
			
			
			
		}

	}

}
