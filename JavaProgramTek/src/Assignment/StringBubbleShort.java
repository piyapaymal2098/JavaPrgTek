package Assignment;

import java.util.Arrays;

public class StringBubbleShort {

	public static void main(String[] args) {
		String []s= {"my","name","is","supriya"};
	int n=s.length;
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(s[i].length()>s[j+1].length()) {
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
System.out.println(Arrays.toString(s));
	
	}

}
