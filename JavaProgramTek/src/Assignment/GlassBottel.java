package Assignment;

public class GlassBottel extends bottel {
	String bottelType="GlassBottel";
	
	public static void main(String[] args) {
		GlassBottel g= new GlassBottel();
		System.out.println(g.bottelType);
	    System.out.println(g.color);
	    g.use();
	}
}
