package Assignment;

public class cow extends Animal{
	String  color="black";
	public void use() {
		System.out.println("Priovdes Milk");
	}
	public static void main(String[] args) {
	cow c= new cow();
	System.out.println(c.color);
	System.out.println(c.type);	
	c.eat();
	c.use();
	

	}

}
