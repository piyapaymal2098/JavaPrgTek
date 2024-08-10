package Assignment;

public class Reverse_The_Array_Without_Using_length {

	public static void main(String[] args) {
		int[] input= {2,3,4,5,6,7};
		String outp="";
		int i=0;
		while(true) {
			try {
			int	ch=input[i];
			outp=ch+outp;
				 i++;
				// outp++;	
			}
			catch (ArrayIndexOutOfBoundsException e){
				break;
				
			}
		}
		System.out.println(outp);
		

	}

}
