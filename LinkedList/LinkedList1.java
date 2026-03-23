package LinkedList;

public class LinkedList1 {
    public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }  
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        if(head==null){
        //step1 Create new Node
        Node newNode=new Node(data);
        head=tail=newNode;
        return;

        } 
        //step1 Create new Node
        Node newNode=new Node(data);
        //step2 newNode next=head
        newNode.next=head; 
        //step3 head =newNode
        head=newNode;

    }

     


    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        ll.addFirst(1);
        ll.addFirst(2);
        System.out.println(ll);
        
    }
}
