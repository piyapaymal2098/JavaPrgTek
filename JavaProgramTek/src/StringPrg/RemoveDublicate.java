package StringPrg;


import java.util.Iterator;

import java.util.LinkedHashSet;

public class RemoveDublicate {

	public static void main(String[] args) {
		String s= "india";
		LinkedHashSet<Character> hs= new LinkedHashSet();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		}
		for (Character o : hs) {
			System.out.print(o);
			
		}
	}

}
