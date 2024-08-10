package StringPrg;

public class String_Is_Palindrome_Or_Not {

	public static void main(String[] args) {
		String s="amma";
		String res="";

		for(int i=s.length()-1;i>=0;i--) {
		res=res+s.charAt(i);
		}
		
		if(s.equals(res)) {
			System.out.println( s  +" String is palindrom");
		}
		else {
			System.out.println( s+"  String is  not palindrom");
		}

	}

}