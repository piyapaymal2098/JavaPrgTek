package Assignment;

public class Recursion {

	public static void main(String[] args) {
		String s="india";
		int res=s.length()-1;
		reverse(s,res);
	}
		public static void reverse(String s,int res) {
		if(res>=0)	{
				System.out.print(s.charAt(res));
				reverse(s,res-1);
			}
		
 
	}

}
