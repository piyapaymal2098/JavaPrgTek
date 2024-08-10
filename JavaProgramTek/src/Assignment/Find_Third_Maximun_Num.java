package Assignment;

public class Find_Third_Maximun_Num {

	public static void main(String[] args) {
		int []a= {12,34,56,32,12,78,85,79};
		int max=Integer.MIN_VALUE;
		int sec_max=Integer.MIN_VALUE;
		int Third_max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				Third_max=sec_max;
				sec_max=max;
				max=a[i];
			}else if(sec_max<a[i] && max!=a[i]) {
				Third_max=sec_max;
				sec_max=a[i];
			}else if(Third_max<a[i]){
				Third_max=a[i];
				
			}
			
		}
		System.out.println(Third_max);
		
	}

}
