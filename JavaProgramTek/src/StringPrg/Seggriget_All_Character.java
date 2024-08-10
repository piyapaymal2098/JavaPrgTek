package StringPrg;

public class Seggriget_All_Character {

	public static void main(String[] args) {
	String input="a1b6^&jsdh899+";
	String aphabate="";
	String number="";
	String specialchar="";
	for(int i=0;i<input.length();i++) {
	char	ch =input.charAt(i);
	if(ch>='0'&&ch<='9') {
		number+=ch;
	}
	else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
		
		aphabate+=ch;
	}
	else
	{
		specialchar+=ch;
	}
	}
	System.out.println("specialcharacter:   "+specialchar);
	System.out.println("number:   "+number);
	System.out.println("aphabate:   "+aphabate);
	}

}
