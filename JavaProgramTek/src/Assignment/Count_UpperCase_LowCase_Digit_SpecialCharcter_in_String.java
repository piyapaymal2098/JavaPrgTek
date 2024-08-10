package Assignment;

public class Count_UpperCase_LowCase_Digit_SpecialCharcter_in_String {

	public static void main(String[] args) {
		
		String input="ZYXa1b6^&jsdh899+";
		int  UperrAphabat=0;
		int LowerAphabate=0;
		int number=0;
		int specialchar=0;
		for(int i=0;i<input.length();i++) {
		char	ch =input.charAt(i);
		if(ch>='0'&&ch<='9') {
			number++;
		}
		else if(ch>='a'&&ch<='z') {
			
			LowerAphabate++;
		}
		else if(ch>='A'&&ch<='Z') {
			
			UperrAphabat++;
		}	
		else
		{
			specialchar++;
		}
		}
		System.out.println("specialcharacter:   "+specialchar);
		System.out.println("number:   "+number);
		System.out.println("aphabate:   "+UperrAphabat);
		System.out.println("aphabate:   "+LowerAphabate);
		}

	}


