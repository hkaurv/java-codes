package PractiseCode;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicatesFromLinkedList {
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Function to remove duplicates from an
	   unsorted linked list */
	void remove_duplicates() {
		Node ptr1 = null, ptr2 = null, dup = null;
		ptr1 = head;

		/* Pick elements one by one */
		while (ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;

            /* Compare the picked element with rest
                of the elements */
			while (ptr2.next != null) {

				/* If duplicate then delete it */
				if (ptr1.data == ptr2.next.data) {

					/* sequence of steps is important here */
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
					System.gc();
				} else /* This is tricky */ {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}

}
//--------------------------------------------------------------------------------------------------------------------------------
	//We traverse the link list from head to end. For every newly encountered element,
// we check whether it is in the hash table:
// if yes, we remove it; otherwise we put it in the hash table.
	static class node
	{
		int val;
		node next;

		public node(int val)
		{
			this.val = val;
		}
	}

	/* Function to remove duplicates from a
	   unsorted linked list */
	static void removeDuplicate(node head)
	{
		// Hash to store seen values
		HashSet<Integer> hs = new HashSet<>();

		/* Pick elements one by one */
		node current = head;
		node prev = null;
		while (current != null)
		{
			int curval = current.val;

			// If current value is seen before
			if (hs.contains(curval)) {
				prev.next = current.next;
			} else {
				hs.add(curval);
				prev = current;
			}
			current = current.next;
		}

	}

	/* Function to print nodes in a given linked list */
	static void printList(node head)
	{
		while (head != null)
		{
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args)
	{
        /* The constructed linked list is:
         10->12->11->11->12->11->10*/
		node start = new node(10);
		start.next = new node(12);
		start.next.next = new node(11);
		start.next.next.next = new node(11);
		start.next.next.next.next = new node(12);
		start.next.next.next.next.next = new node(11);
		start.next.next.next.next.next.next = new node(10);

		System.out.println("Linked list before removing duplicates :");
		printList(start);

		removeDuplicate(start);

		System.out.println("\nLinked list after removing duplicates :");
		printList(start);
	}
}




