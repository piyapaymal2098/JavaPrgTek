package StringPrg;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintDuplicate {

	public static void main(String[] args) {
		String s= "india";
		HashMap<Character, Integer> map= new HashMap();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for (Entry<Character, Integer> data : map.entrySet()) {
			if(data.getValue()>1) {
				System.out.println(data.getKey());
			}
			
			
		}

	}

}
