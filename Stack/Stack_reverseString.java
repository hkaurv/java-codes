package Stack;

public class Stack_reverseString {
// stack doesnt need shifting elements around

	private int maxSize;
	private char[] stackArray;
	private int top; //index position of last item placed in stack

	public Stack_reverseString(int size){
		this.maxSize=size;
		this.stackArray=new char[maxSize];
		this.top=-1;//until we start placing items

	}

	public void push(char j) {
		if (isFull()) {
			System.out.println("this stack is full");
		} else {
			top++;
			stackArray[top] = j;
		}
	}
	public char pop(){
		if(isEmpty()){
			System.out.println("stack is empty");
			return '0'; //throw exception
		}
		else{
			int old_top=top;
			top--;
			return stackArray[old_top];
		}

	}
	public char peak(){
		return stackArray[top];

	}

	public boolean isEmpty(){
		return (top==-1);


	}

	public  boolean isFull(){
		return (maxSize-1==top);
	}
}
