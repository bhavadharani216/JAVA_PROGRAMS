package Doubly_Linked_List;
import java.util.*;
public class doubly_ll {
	Node head;
	Node tail;
	
	class Node{
		int data;
		Node prev;
		Node next;
	Node (int val){
		data = val;
		next = null;
		prev= null;
	}
	public void DoublyLinkedList(){
		head = null;
		tail= null;
		
	}
		
	}
	public void inserAtBeginning(int val) {
		Node newNode = new Node(val);
		//newNode.data=val; //assigining value to data
		if(head ==null) {
			head= newNode;
			tail = newNode;
		}
		else {
			head.prev=newNode;
			newNode.next=head;
			head=newNode;
		}
	}
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data +" ");
			temp = temp.next;
		}
		
	}
	
	public void displayRev() {
		Node temp = tail;
		while(temp != null) {
			System.out.println(temp.data +" ");
			temp = temp.prev;
		}
		
	}


	public static void main(String[] args) {
		doubly_ll list = new doubly_ll ();
		 

	}

}

// step 1 - create node 
// step 2 - class node - define node- what are the things under node
// step 3 - explain node class -- define type of data 
// step 4 - pass val as input to Node class
// step 5 - insert at begin, inser at position can be done
 
