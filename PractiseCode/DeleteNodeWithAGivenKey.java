package PractiseCode;

import ds.linkedlist.Node;

public class DeleteNodeWithAGivenKey {}
//Delete Node with a Given Key
	/*First, we have to find the key in the linked list. We’ll keep two pointers, current and previous, as we iterate the linked list.

	If the key is found in the linked list, then the current pointer would be pointing to the node containing the key to be deleted.
	The previous should be pointing to the node before the key node.

	This can be done in a linear scan and we can simply update current and previous pointers as we iterate through the linked list.*/
	/*public static Node delete_node(Node head, int key)
	{
		Node prev = null;
		Node current = head;

    while (current != null) {
		if (current.data == key) {
			if(current == head){
				head = head.next;
				current = head;
			}
			else{
				prev.next = current.next;
				current = current.next;
			}
		}
		else {
			prev = current;
			current = current.next;
		}
	}
*/
	// key not found in list
   /* if (current == null) {
		return head;
	}

    return head;
}*/
	/*public static void main(String[] args) {
		LinkedListNode list_head = null;
		list_head = LinkedList.create_random_list(10);
		System.out.print("Original: ");
		LinkedList.display(list_head);

		ArrayList<Integer> lst = LinkedList.to_list(list_head);

		System.out.printf("\nDeleting %d",lst.get(5));
		list_head = delete_node(list_head, lst.get(5));
		System.out.printf("\nAfter Delete Node:");
		LinkedList.display(list_head);

		System.out.printf("\nDeleting (Non-Existing) %d", 101);
		list_head = delete_node(list_head, 101);
		System.out.print("\nAfter Delete Node:");
		LinkedList.display(list_head);

		System.out.printf("\nDeleting 1st node:%d", lst.get(0));
		list_head = delete_node(list_head, lst.get(0));
		System.out.printf("\nAfter Delete 1st Node:");
		LinkedList.display(list_head);

		lst = LinkedList.to_list(list_head);
		System.out.printf("\nDeleting last node:" , lst.get(lst.size() - 1));
		list_head = delete_node(list_head, lst.get(lst.size() - 1));
		System.out.printf("\nAfter Delete last Node:");
		LinkedList.display(list_head);*/
