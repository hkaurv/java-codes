package ArrayList;

import java.util.ArrayList;

public class ArrayListE {

	//part of java.util package
	//how to declare ArrayList
	//ArrayList<data-type> name= new ArrayList<data-type>();
	//list <data-type> name= new ArrayList<data-type>();
	//non-synchronized
	//elements can be randomlly accessed using index
	//different methods used= .add,.contains.remove.isEmpty,.indexOf
	//arraylist can accept duplicate values and will be treated as separate index
	//ArrayList is better for storing and accessing data.

	//ArrayListname.add("");


	public static void main(String[] args)
	{

		// Declaring an ArrayList
		ArrayList <Integer> arrayList= new ArrayList<>();

		// Appending the new elements
		// at the end of the list
		for (int i = 1; i <= 5; i++)
			arrayList.add(i);

		// Printing the ArrayList
		System.out.println(arrayList);

		// Removing an element from the
		// List
		arrayList.remove(3);

		// Printing the ArrayList after
		// removing the element
		System.out.println(arrayList);
	}
}

