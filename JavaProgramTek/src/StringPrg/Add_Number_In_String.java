package StringPrg;

public class Add_Number_In_String {

	public static void main(String[] args) {
		String input="1234abcd23";
		int sum=0;
		for(int i=0;i<input.length();i++) {
			char ch =input.charAt(i);
			if(ch>='0'&&ch<='9') {
				sum=sum+ch-48;
			}
		}
System.out.println("The sum is:  "+sum);
	}

}
