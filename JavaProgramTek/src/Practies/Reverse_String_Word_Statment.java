package Practies;

public class Reverse_String_Word_Statment {

	public static void main(String[] args) {
		String s="am bangalor";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String ch=s1[i];
			
			for(int j=ch.length()-1;j>=0;j--) {
				System.out.print(ch.charAt(j));
				
			}
			System.out.print(" ");
			
		}
		
	}

}
