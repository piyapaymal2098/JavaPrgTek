package Practies;

import java.util.Arrays;

public class NEWANAGRAM {

	public static void main(String[] args) {
		String str1="Care";
		String str2="Race";
		
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();

			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);//it will sort increasing order it will take acsi value 
	
			Arrays.sort(ch2);
			boolean b = Arrays.equals(ch1, ch2);
			
			if(b==true) {
				System.out.println("anagram");
			}
			else {
				System.out.println(" No anagram");
			}

	}

}
