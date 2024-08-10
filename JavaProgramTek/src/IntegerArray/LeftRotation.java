package IntegerArray;

public class LeftRotation {

	public static void main(String[] args) {
	String []s= {"my", "name","is","Dora"};
	for(int i=1;i<=4;i++) {
		String temp=s[0];
		for(int j=0;j<s.length-1;i++) {
			s[j]=s[j+1];	
		}
		s[s.length-1]=temp;
	}
     System.out.println(s);
	}

}
