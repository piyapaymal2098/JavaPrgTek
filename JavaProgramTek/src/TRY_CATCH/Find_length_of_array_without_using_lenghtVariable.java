package TRY_CATCH;

public class Find_length_of_array_without_using_lenghtVariable {

	public static void main(String[] args) {
		
	int[] input= {2,3,4,5,6,7};
	int outp=0;
	int i=0;
	while(true) {
		try {
		int	ch=input[i];
			 i++;
			 outp++;	
		}
		catch (ArrayIndexOutOfBoundsException e){
			break;
			
		}
	}
	System.out.println(outp);

	}

}
