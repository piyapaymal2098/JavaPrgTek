package StringArrayprg;

public class SubString_length_is_more_than_three {

	public static void main(String[] args) {
		String s="india";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				//System.out.print(s.substring(i, j)+" ");
		if(s.substring(i, j).length()>=3)
			{
			System.out.print(s.substring(i, j)+" ");
		}
			}
			
		}
	
	}

}
