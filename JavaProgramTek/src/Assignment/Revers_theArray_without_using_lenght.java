package Assignment;

public class Revers_theArray_without_using_lenght {

	public static void main(String[] args) {
		int[] input= {2,3,4,5,6,7};
		String outp="";
		
		for (int a : input) {
		
			outp=a+outp;

		}
		System.out.println(outp);
	}

}
