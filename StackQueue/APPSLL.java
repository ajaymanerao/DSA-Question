package StackQueue;
import StackQueue.SinglyLinkedList.Node;
public class APPSLL {
    public static void main(String[] args) {
		
		SinglyLinkedList list=new SinglyLinkedList();   // head=null
		
		Node newNode=new Node(10);   // [100]  | 10 | null|
		
		Node head=list.getHead();
		head=newNode;
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		
		list.display();

        // Node head=list.getHead();
		// head=newNode;
		// list.addLast(50);
		// list.addLast(60);
		// list.addLast(70);
		// list.display();
		
	}

    
}
