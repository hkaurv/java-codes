package Sets;

import java.util.Iterator;
import java.util.Set;

public class TreeSet {

	// It behaves like a simple set with the exception that it stores elements in a sorted format
	//TreeSet uses a tree data structure for storage
	//Objects are stored in sorted, ascending order

	public static void main(String[] args)
	{
		Set<String> ts = new java.util.TreeSet<>();

		// Adding elements into the TreeSet
		// using add()
		ts.add("zim");
		ts.add("India");
		ts.add("Australia");
		ts.add("South Africa");

		// Adding the duplicate
		// element
		ts.add("India");

		// Displaying the TreeSet
		System.out.println(ts);

		// Removing items from TreeSet
		// using remove()
		ts.remove("Australia");
		System.out.println("Set after removing "
				+ "Australia:" + ts);

		// Iterating over Tree set items
		System.out.println("Iterating over set:");
		Iterator<String> i = ts.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}
