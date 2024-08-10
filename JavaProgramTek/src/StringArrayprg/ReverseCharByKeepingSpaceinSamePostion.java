package StringArrayprg;

public class ReverseCharByKeepingSpaceinSamePostion {

	public static void main(String[] args) {
		//outpu:=====> a idni evoli
		String s="i love india";
	//	int s1 = s.replaceAll(" ", "").length()-1;
		 String s1 = s.replaceAll(" ", "");//iloveindian
		   int n=s1.length()-1;//last index of s1
		   for(int i=0;i<s.length();i++) {
			   if(s.charAt(i)==' ') {
				   System.out.print(s.charAt(i));
			   }
			   else {
				//   System.out.print(s1.charAt(n--));
				   System.out.print(s1.charAt(n));
				   n--;
			   }
		   }
	
	}

}
