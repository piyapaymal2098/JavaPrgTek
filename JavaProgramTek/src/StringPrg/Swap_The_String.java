package StringPrg;

public class Swap_The_String {

	public static void main(String[] args) {
		String s= "i am from Maharashtra";
		String  []str =s.split(" ");
		String tem=str[0];
		
		str[0]=str[str.length-1];
		
		str[str.length-1]=tem;
		for (String a : str) {
			System.out.print(a+" ");
			
		}
			
			
		
		
		
		
		

	}

}
