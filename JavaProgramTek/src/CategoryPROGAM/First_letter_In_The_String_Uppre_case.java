package CategoryPROGAM;

public class First_letter_In_The_String_Uppre_case {

	public static void main(String[] args) {
	String s="i am from kolhapur";
	String str[]=s.split(" ");
	for(int i=0 ;i<str.length;i++) {
		String ch=str[i];
	ch=Character.toUpperCase(ch.charAt(0))+ch.substring(1);//substring start from 1index || upper case will happen 0 index
	System.out.print(ch +" ");
		
	}
	

	}

}
