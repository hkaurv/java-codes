package Maps;

import java.util.Map;

public class LinkedHashMap{

//LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it.
// HashMap provided the advantage of quick insertion, search and deletion but it never maintained the track and order of insertion which
// the LinkedHashMap provides
// where the elements can be accessed in their insertion order. Let’s see how to create a map object using this class.

		public static void main(String[] args)
		{
			Map<String, Integer> map
					= new java.util.LinkedHashMap<>();
			map.put("vaibhav", 20);

			map.put("vishal", 10);
			map.put("sachin", 30);
		//	map.put("vaibhav", 20);

			for (Map.Entry<String, Integer> e : map.entrySet())
				System.out.println(e.getKey() + " "
						+ e.getValue());
		}
}

