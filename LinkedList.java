public class LinkedList{
    private Node head;
    private Node tail;
    int length;

public class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;

    }
}

 public LinkedList(int value){
    Node newnode = new Node(value);
    head = newnode;
    tail = newnode;
    length = 1;

 }

 public void append(int value){
    Node newnode = new Node(value);
     tail.next = newnode;
     tail = newnode;
     length++;
 }
 
 public void prepend(int value){
    Node newnode = new Node(value);
    newnode.next = head;
    head = newnode;
    length++;
 }
 
 public  void PrintList(){
     Node current = head;
    while(current != null){
        System.out.println(current.value);
        current = current.next;

    }
 }
 public static void main(String[] args){
        LinkedList mylist = new LinkedList(10);

        mylist.append(20);
        mylist.append(30);
        mylist.prepend(5);

        mylist.PrintList();


 }





}
    

