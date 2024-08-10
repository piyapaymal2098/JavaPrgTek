package StringArrayprg;

import java.lang.reflect.Array;
import java.util.Arrays;

public class string_Is_anagram {

	public static void main(String[] args) {
		String str1="Care";
		String str2="Races";
		boolean flag=true;

		if(str1.length()!=str2.length()) {
//			flag=false;
			System.out.println("not an anagram");
			return;//stop the excution we use return beacuse break statment will not work i are stoping excution it self other wise it will excute last if block also
		}
		else {
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
				
			}
			
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=ch2[i]) {
					flag=true;
					System.out.println("not an anagram");
					break;
				}
			}
		}

		if(true) {
			System.out.println("Anagrams");
		}

	}

}
