package Hash;

import java.util.HashMap;
import java.util.Map;

public class Hashing {

	public static void main(String[] args) 
	{
		HashMap<String ,Integer> map= new HashMap<>();
		
		
		map.put("india",120);
		map.put("us",130);
		map.put("aus", 190);
		
		System.out.println(map);
		map.put("us", 290);
		System.out.println(map);
		
		
		if(map.containsKey("uai")) 
		{
		System.out.println("present in the map");	
		}
		else
		{
			System.out.println("key is not present in the map");
		}

	}

}
