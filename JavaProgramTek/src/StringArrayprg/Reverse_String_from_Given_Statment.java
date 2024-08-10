package StringArrayprg;

public class Reverse_String_from_Given_Statment {

	public static void main(String[] args) {
	String  s= "Welcome to tp office";
	String str[]=s.split(" ");
	for(int i=0;i<str.length;i++) {
		String s1=str[i];
		//outer
		for(int j=s1.length()-1;j>=0;j--) {
			//inner loop is used revers
			System.out.print(s1.charAt(j));
			
		}
		System.out.print(" ");
	}
	 
	}
}
