/**
 * DoblyLinkedll
 */
public class DoblyLinkedll {
    Node head;
    Node tail;
    int length;

public class Node{
    int value;
    Node next;
    Node prev;

    Node(int value){
        this.value = value;
    }
}

    DoblyLinkedll(int value){

    Node newnode = new Node(value);
    newnode.prev = null;
    head = newnode;
    tail = newnode;
    length = 1;
} 

    public void append(int value){
        Node newnode = new Node(value);
        if(length == 0){
            head = newnode;
            tail = newnode;
            length++;
        }

        newnode.prev = tail;
        newnode.next = null;
        tail.next = newnode;
        tail = newnode;
        length++;
    }

    public void prepend(int value){
        Node newnode = new Node(value);
        if(length == 0){
            head = newnode;
            tail = newnode;
            length++;
        }
        newnode.prev = null;
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        length++;
    }
    public boolean isPalindrome(){
        Node forward = head;
        Node backward = tail;

        while(forward != backward && forward.prev != backward){
            if(forward.value != backward.value){
                return false;
            }
            forward = forward.next;
            backward = backward.prev;
        }
        return true;
    }


    public void reverseBetween(int startIndex , int endIndex){
        
        if(head == null || startIndex > endIndex || startIndex < 0 || startIndex == endIndex){
            return;
        }

        Node current = head;
        for(int i = 0; i < startIndex; i++){
            current = current.next;
        }

        Node startNode = current;
        Node beforeIndex = current.prev;

        Node prev = current.prev;
       

        for(int i = startIndex; i <= endIndex; i++){

            Node after = current.next;

            current.prev = current.next;
            current.next = prev;

            prev = current;
            current = after;

        }
        if(beforeIndex != null){

            beforeIndex.next = prev;
            prev.prev = beforeIndex;
        }else{
            head = prev;
            prev.prev = null;
        }


        startNode.next = current;
        if(current != null){
            current.prev = startNode;
        }else{
            tail = startNode;
        }
    }




    

    public void printlist(){
        if(length == 0){
            System.out.println("List is empty");
               }

               Node temp = head;
               while(temp != null){
                System.out.println(temp.value);
                temp = temp.next;
               }
    }

    public static void main(String[] args){
        DoblyLinkedll newlist;
        newlist = new DoblyLinkedll(10);
        newlist.append(20);
        newlist.append(30);
        newlist.printlist();


        newlist =  new DoblyLinkedll(1);
        newlist.append(2);
        newlist.append(1);
        newlist.printlist();
        System.out.println("Palindrome number:" +newlist.isPalindrome());

        newlist = new DoblyLinkedll(1);
        newlist.append(2);
        newlist.append(3);
        newlist.append(4);  
        newlist.append(5);
        System.out.println("Before reversing between index 1 and 3");
        newlist.printlist();   
        newlist.reverseBetween(1, 3);
        System.out.println("After reversing between index 1 and 3");
        newlist.printlist();

    }

}


