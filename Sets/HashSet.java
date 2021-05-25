package Sets;

import java.util.*;

public class HashSet<S> {
// set does not accept duplicate values
	// e-commerce site where same items cannot be added to cart
	//hashset allows null values
	//non -syncronized
	//HashSet is the best approach for search operations.
	//The initial default capacity of HashSet is 16, and the load factor is 0.75.

	public static void main(String[] args)
	{
		// Set demonstration using HashSet
        Set<String> hash_Set= new java.util.HashSet<>();
		hash_Set.add("Geeks");
		hash_Set.add("For");
		hash_Set.add("Geeks");
		hash_Set.add("Example");
		hash_Set.add("Set");

		System.out.println(hash_Set);

		// Iterating though the Set
		for (String value : hash_Set)
			System.out.print(value + ", ");
		System.out.println();

		// Iterating over hash set items
		System.out.println("Iterating over set:");
		Iterator<String> i = hash_Set.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}

	/*	public static void main(String args[])
		{

			Set<Integer>a= new java.util.HashSet<>();
			a.addAll(Arrays.asList(
					new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
Set<Integer>	b= new java.util.HashSet<>() ;
b.addAll(Arrays.asList(
					new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

			// To find union
			Set<Integer> union = new HashSet<Integer>(a);
			union.addAll(b);
			System.out.print("Union of the two Set");
			System.out.println(union);

			// To find intersection
			Set<Integer> intersection = new HashSet<Integer>(a);
			intersection.retainAll(b);
			System.out.print("Intersection of the two Set");
			System.out.println(intersection);

			// To find the symmetric difference
			Set<Integer> difference = new HashSet<Integer>(a);
			difference.removeAll(b);
			System.out.print("Difference of the two Set");
			System.out.println(difference);
		}*/
}
