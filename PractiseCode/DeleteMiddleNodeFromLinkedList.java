package PractiseCode;


//approach 1-
//traverse the whole linked list and count the numbver of nodes in the linked list
//Traverse the list again and delete the n/2th node using the simple deletion process


//approach 2
// Declare 3 pointers slow_ptr,fast_ptr and prev
//Traverse the linked list
//move fast_ptr by two and slow_ptr by one and while traversing keep track of the previous slow_ptr by storing it in prev
//When fast_ptr reaches end of the linekd list, slow_ptr reached the middle f the linked list
//Delete the middle node


public class DeleteMiddleNodeFromLinkedList {
	static class Node {
		public int data;
		public Node next;

	}


	static Node deleteANode(Node head){

		//Base cases
		if(head==null)return null;
		if(head.next==null)return null;



		//Initialize slow and fast pointers to reach middle of the linked list

		Node slow_ptr=head;
		Node fast_ptr=head;

		// find the middle and previous of middle
		Node prev=null;

		//to store previous of slow_ptr
		while(fast_ptr!=null && fast_ptr.next!=null){
			fast_ptr=fast_ptr.next.next;
			prev=slow_ptr;
			slow_ptr=slow_ptr.next;
		}

//delete the middle node
		prev.next=slow_ptr.next;
		return head;
	}
	// A utility function to print
	// a given linked list
	static void printList(Node ptr)
	{
		while (ptr != null) {
			System.out.print(ptr.data + "->");
			ptr = ptr.next;
		}
		System.out.println("NULL");
	}

	// Utility function to create a new node.
	static Node newNode(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}

	/* Drier code*/
	public static void main(String[] args)
	{
		/* Start with the empty list */
		Node head = newNode(1);
		head.next = newNode(2);
		head.next.next = newNode(3);
		head.next.next.next = newNode(4);

		System.out.println("Given Linked List");
		printList(head);

		head = deleteANode(head);

		System.out.println("Linked List after deletion of middle");
		printList(head);
	}
}
