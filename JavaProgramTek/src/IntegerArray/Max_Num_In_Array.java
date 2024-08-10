package IntegerArray;

public class Max_Num_In_Array {

	public static void main(String[] args) {
	int []a= {20,10,-10,50,60};
	int max=a[0];
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(max<a[i]){
			max=a[i];	
		}
	}
	
	System.out.println("maximum:    "+max);
	for(int i=1;i<a.length;i++) {
		if(min>a[i]){ // 20>10
			min=a[i];	
		}
	}
	System.out.println("minimum:   "+min);
	}

}
