package Practise;

import java.util.LinkedList;

public class linkedList_AddTwoNumbers {
//Initialize current node to dummy head of the returning list.
//Initialize carry to 00.
//Initialize pp and qq to head of l1l1 and l2l2 respectively.
//Loop through lists l1l1 and l2l2 until you reach both ends.
//Set xx to node pp's value. If pp has reached the end of l1l1, set to 00.
//Set yy to node qq's value. If qq has reached the end of l2l2, set to 00.
//Set sum = x + y + carrysum=x+y+carry.
//Update carry = sum / 10carry=sum/10.
//Create a new node with the digit value of (sum \bmod 10)(summod10) and set it to current node's next, then advance current node to next.
//Advance both pp and qq.
//Check if carry = 1carry=1, if so append a new node with digit 11 to the returning list.
//Return dummy head's next node.

	public static class Node {
		int val;
		Node next;

		Node() {
		}

		Node(int val) {
			this.val = val;

		}

		Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	public static Node addTwoNumbers(Node l1, Node l2) {
		Node result = new Node();
		Node head = result;

		int remaining = 0;

		while (l1 != null || l2 != null || remaining != 0) {
			int number = 0;
			if (l1 != null) {
				number = l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				number += l2.val;
				l2 = l2.next;
			}

			number += remaining;
			remaining = number / 10;
			number = number % 10;

			head.val = number;
			//Add check for not to add extra node at the end
			if (l1 != null || l2 != null || remaining != 0) {
				head.next = new Node();
				head = head.next;
			}
		}


		return result;
	}

	public static Node addTwoNumbers2(Node l1, Node l2) {
		Node dummyHead = new Node(0);
		Node p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new Node(sum % 10);
			curr = curr.next;
			if (p != null) p = p.next;
			if (q != null) q = q.next;
		}
		if (carry > 0) {
			curr.next = new Node(carry);
		}
		return dummyHead.next;
	}

	public static void main(String[] args) {

	}
}