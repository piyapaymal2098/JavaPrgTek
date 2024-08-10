package IntegerArray;

public class Swap_the_num_without_using_third_variable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swap");
		System.out.println("a:  "+ a);
		System.out.println("b:  "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
System.out.println("++++=====++++");
		System.out.println("after swap");
		System.out.println("a:  "+ a);
		System.out.println("b:  "+ b);

	}

}
