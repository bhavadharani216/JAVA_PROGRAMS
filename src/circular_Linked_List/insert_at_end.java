package circular_Linked_List;

public class insert_at_end<T> {

	 
			Node last; // in the circular linked list always points the first node, so give as node last instead of node head ;

			class Node{
				T data;  //giving t means can give any type of data can be store
				Node next;
				Node (T val){
					data = val;
					next=null;
				}
			}
			
			insert_at_end(){
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
					newNode.next=newNode;
					last=newNode;
				}
			}
			
			public void display() {
				Node temp = last.next;
				do {
					System.out.println(temp.data + " ");
					temp=temp.next;//this is for jumping , next next element printing
				}while(temp != last.next);
			}
			
			public T deleteBeginning() {
				if(last==null) {
					throw new IndexOutOfBoundsException(" Deletion attempted on empty list");
				T temp = last.next.data; 
				if(last.next==last)
					last=null;
				}
				else
					last.next=last.next.next;
				
				return temp;
			}
			
			public static void main(String[] args) {
				insert_at_end <String> list = new insert_at_end <String> ();

			}

}
