package CategoryPROGAM;

public class ReversRecursion {

	public static void main(String[] args) {
		
		reverse("supriya");//method
	}
		public static void reverse(String s) 
		{
			if(s.length()>=1) {
				System.out.print(s.charAt(s.length()-1));//ayi
				reverse(s.substring(0, s.length()-1));
				
//				return reverse(s.substring(0, s.length()-1));
//			} 
//			else {
//				return'\u0000';
//			}
//			
			}

	}
 
}
