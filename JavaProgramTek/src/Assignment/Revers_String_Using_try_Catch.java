package Assignment;

public class Revers_String_Using_try_Catch {

	public static void main(String[] args) {
		
	String input= "pyramid";
	String outp="";
	int i=0;
	while(true) {
		try {
		char ch=input.charAt(i);
		outp=ch+outp;
			 i++;
			 
		}
		catch (StringIndexOutOfBoundsException e){
			break;
			
		}
	}
	System.out.println(outp);

	}

}
