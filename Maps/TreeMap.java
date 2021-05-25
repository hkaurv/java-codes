package Maps;

import java.util.Map;

public class TreeMap {

//The map is sorted according to the natural ordering of its keys
	//sorted on the basis of the key value
public static void main(String[] args)
{
	Map<String, Integer> map
			= new java.util.TreeMap<>();

	map.put("vishal", 10);
	map.put("sachin", 30);
	map.put("vaibhav", 20);

	for (Map.Entry<String, Integer> e : map.entrySet())
		System.out.println(e.getKey() + " "
				+ e.getValue());
}
}
