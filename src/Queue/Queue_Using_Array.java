//create array named arr[] 
//create a object using a class name  as Queue_Using_Array
// initialize front and rear 
// q.enqueue
// create a method for enqueue
// rear value initially -1


package Queue;

public class Queue_Using_Array {
	static final int MAX_SIZE = 30;
	int arr [] = new int[MAX_SIZE];
	int front , rear;
	Queue_Using_Array() {
		arr=new int[MAX_SIZE];
		rear =-1;
		front =-1;
		
	}
	public void enqueue(int val){
		if(rear==MAX_SIZE-1)
			throw new IndexOutOfBoundsException("queue is full");
		if(front == -1)
			front++;
		arr[++rear]=val;
		
	}
	
	public int dequeue() {
		if(front==-1)
			throw new IndexOutOfBoundsException("Queue is empty	");
		return arr[front++];
			
			
	}

	public static void main(String[] args) {
		Queue_Using_Array q = new Queue_Using_Array();
		q.enqueue(4);
		q.enqueue(12);
		
		 

	}

}
