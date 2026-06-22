// create a object by using main class 
// define things in Node class
// pass input val in Node constructor
// node last instead of node head
// use a class name to create a constructor
//create a method named as insertatbeginning

package circular_Linked_List;

public class circularLinkedList <T> {
	Node last; // in the circular linked list always points the first node, so give as node last instead of node head ;

	class Node{
		T data;  //giving t means can give any type of data can be store
		Node next;
		Node (T val){
			data = val;
			next=null;
		}
	}
	
	circularLinkedList(){
		last = null;
	}
	
	public void insertAtBeginning(T val) {
		Node newNode = new Node(val);
		//newNode.data=val;// this can be given as in parameter
		
		// if value is null
		if(last ==null) {
			newNode.next=newNode;
			last=newNode;
		}
		// if value is there
		
		else {
			newNode.next=last.next;
			last=newNode;
		}
	}
	
	public static void main(String[] args) {
		circularLinkedList <String> list = new circularLinkedList <String> ();

	}

}
