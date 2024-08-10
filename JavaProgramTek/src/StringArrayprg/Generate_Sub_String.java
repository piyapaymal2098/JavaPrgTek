package StringArrayprg;

public class Generate_Sub_String {

	public static void main(String[] args) {
		
	String s="india";
			for(int i=0;i<s.length();i++) {
				for(int j=i+1;j<=s.length();j++) {
					System.out.print(s.substring(i, j)+" ");
					//in subString it will not consider last index 
					//sum
					//j=0+1=1 (0,0)= s
					//j=0+2=2 (0,1)= su
				}
			}
	}

}
 