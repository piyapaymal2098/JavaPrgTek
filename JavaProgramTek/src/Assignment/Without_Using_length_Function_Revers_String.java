package Assignment;

public class Without_Using_length_Function_Revers_String {

	public static void main(String[] args) {
		String s="india";
		String res="";
		for(char ch:s.toCharArray()){
			res=ch+res;
		}
     System.out.println(res);
	}

}
