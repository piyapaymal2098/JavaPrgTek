package Assignment;

public class Find_Third_Minimun_Num {

	public static void main(String[] args) {
		int []a= {12,34,56,32,21,78,85,79};
		int min=Integer.MAX_VALUE;
		int sec_min=Integer.MAX_VALUE;
		int Third_min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				Third_min=sec_min;
				sec_min=min;
				min=a[i];
			}else if(sec_min>a[i] && min!=a[i]) {
				Third_min=sec_min;
				sec_min=a[i];
			}else if(Third_min>a[i] && min!=a[i]){
				Third_min=a[i];
				
			}

		}
		System.out.println(Third_min);
		
	}

}
