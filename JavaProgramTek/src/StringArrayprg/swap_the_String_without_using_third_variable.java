package StringArrayprg;

public class swap_the_String_without_using_third_variable {

	public static void main(String[] args) {
	String s1="java";
	String s2="api";
	s1=s1+s2;
	//
	s2=s1.substring(0, s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println(s1);
	System.out.println(s2);

	}

}
