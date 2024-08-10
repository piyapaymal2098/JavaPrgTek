package StringPrg;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearningEntrySet {

	public static void main(String[] args) {
		HashMap<String ,Integer> hs= new HashMap();
		hs.put("vk", 18);
		hs.put("Rs", 46);
		hs.put("SKY", 63);
		for (Map.Entry<String, Integer> data : hs.entrySet()) {
			System.out.print(data.getKey());
			System.out.print(data.getValue());
			System.out.println();
		}
		

	}

}
