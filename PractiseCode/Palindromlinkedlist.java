package PractiseCode;

import java.util.Stack;

public class Palindromlinkedlist {

/*
	A simple solution is to use a stack of list nodes. This mainly involves three steps.
	Traverse the given list from head to tail and push every visited node to stack.
	Traverse the list again. For every visited node, pop a node from stack and compare data of popped node with currently visited node.
	If all nodes matched, then return true, else false. */

	static boolean isPalindrome(Node head)
	{

		Node slow = head;
		boolean ispalin = true;
		Stack<Integer> stack = new Stack<Integer>();

		while (slow != null) {
			stack.push(slow.data);
			slow = slow.ptr;
		}

		while (head != null) {

			int i = stack.pop();
			if (head.data == i) {
				ispalin = true;
			}
			else {
				ispalin = false;
				break;
			}
			head = head.ptr;
		}
		return ispalin;
	}

	static class Node {
		int data;
		Node ptr;

		Node(int d) {
			ptr = null;
			data = d;
		}
	}
	public static void main(String args[])
	{
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(3);
		Node six = new Node(2);
		Node seven = new Node(1);
		one.ptr = two;
		two.ptr = three;
		three.ptr = four;
		four.ptr = five;
		five.ptr = six;
		six.ptr = seven;
		boolean condition = isPalindrome(one);
		System.out.println("isPalidrome :" + condition);
	}
}
