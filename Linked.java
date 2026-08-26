public class Linked {
    private Node head;
    private Node tail;
    int length;

    class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;

    }
}
    public Linked(int value){
        Node newnode = new Node(value);
        head = newnode;
        tail = newnode;
        length = 1;

    }

    public void append (int value){
        Node newnode = new Node(value);
        if(length == 0){
            head = newnode;
            tail = newnode;
            length++;
        }
        else{
            tail.next = newnode;
            tail = newnode;
           ;
            
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
    public Node removeLast(){
        if(length ==0){
            return null;
        }
        Node temp = head;
        Node pre = head;

        while(temp.next != null){
            pre = temp;
            temp = temp.next;
            
        }

        if(length == 1){
            head = null;
            tail = null;
        }
        else{
            tail = pre;
            tail.next = null;

        }
        length--;

        return temp;

    }

    public void printlist(){
        Node current;
        current = head;
        while(current != null){
            System.out.print(current.value);
            current = current.next;

        }

    }
}

    

