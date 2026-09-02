public class Linkedloops {

    Node head;
    Node tail;
    int length;

    class Node{
        int value;
        Node next;

    Node( int value){
        this.value = value;
    }
}
    Linkedloops(int value){
        Node newnode =  new Node(value);
        head = newnode;
        tail = newnode;
        length = 1;
    }
    public void append(int value){
        Node newnode = new Node(value);
        if(length == 0){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
        length++;
    }
    public void prepend(int value){
        Node newnode = new Node(value);
        if(length == 0){
            head = newnode;
            tail = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
        length++;
    }
        public void Printlist(){
            Node current = head;
            while(current != null){
                System.out.println(current.value);
                current = current.next;
            }
        }

        public Node Middleoflist(){
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        
    
    
    



        public static void main(String[] args){

         Linkedloops mylist = new Linkedloops(10);
         mylist.append(20);
         mylist.append(30);
         mylist.append(40);
         mylist.append(50);
         mylist.append(60);

         System.out.println("\nlinked list is:");
         mylist.Printlist();

         Linkedloops.Node  middle = mylist.Middleoflist();
         System.out.println("\nMiddle value of linked list is:"+middle.value);




        }
}