package Maps;

import java.util.Map;

public class HashMap {
	// Map key to value

	//mAP interface and hashmap is a class
	//A Map cannot contain duplicate keys and each key can map to at most one value.
	// Some implementations allow null key and null value like the HashMap and LinkedHashMap, but some do not like the TreeMap.
// hashMap is not synchronized, if one program us using this hashmap other can also use.But in case of hashtable other need to wait

	//Why and When to use Maps?
	//
	//Maps are perfect to use for key-value association mapping such as dictionaries.
	// The maps are used to perform lookups by keys or when someone wants to retrieve and update elements by keys. Some examples are:
	//
	//A map of error codes and their descriptions.
	//A map of zip codes and cities.
	//A map of managers and employees. Each manager (key) is associated with a list of employees (value) he manages.
	//A map of classes and students. Each class (key) is associated with a list of students (value).
	public static void main(String args[])
	{
		Map<String, Integer> hm
				= new java.util.HashMap<String, Integer>();
		hm.put("f",540);
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);
		hm.put("f",540);
		//hm.put("b",900);// change element
		hm.remove("a");// remove element from first data type name , in this case string

		// Traversing through the map
		for (Map.Entry<String, Integer> me : hm.entrySet()) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}

}
