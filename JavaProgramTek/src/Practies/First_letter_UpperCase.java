package Practies;

public class First_letter_UpperCase {

	public static void main(String[] args) {
		String s="i am from kolhapur";
		String s1[]=s.split(" ");
	//	String oupt="";
		for(int i=0;i<s1.length;i++) {
			String ch=s1[i];
			ch=Character.toUpperCase(ch.charAt(0))+ch.substring(1);
			System.out.print(ch+" ");
		}
	}
}
