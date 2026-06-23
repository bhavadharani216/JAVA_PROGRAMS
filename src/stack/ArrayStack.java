// if MAX constant variable is used means use final keyword
// use static keyword for creating more objects 
// but it is not necessary to use static , final
// create a object by using class name
//create top variable
//



package stack;

public class ArrayStack {
	static final int MAX_SIZE = 30;
	int arr[] =new int[MAX_SIZE];
	int top;
	ArrayStack() {
		top=-1;
	}
public void push(int val) {
	if(top==MAX_SIZE-1)
		throw new IndexOutOfBoundsException("Stack is full");
	arr[++top]=val;
}

int pop() {
	if(top==-1)
		throw new IndexOutOfBoundsException("Stack is empty");
	return arr[top--];
}


	public static void main(String[] args) {
		ArrayStack stack1 = new ArrayStack();
		stack1.push(4);
		stack1.push(6);
		stack1.pop();
		 
	}

}
