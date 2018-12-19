package songMap;

import java.util.HashMap;

public class TestMap {
	
	public static void main(String[] args)
	{
		HashMap<String, Integer> scross = new HashMap<String, Integer>();
		scross.put("Kathy", 42);
		scross.put("Bert", 343);
		scross.put("Skyler", 420);
		
		System.out.println(scross);
		System.out.println(scross.get("Bert"));
	}

}
