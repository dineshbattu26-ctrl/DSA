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

            tail = pre;
            tail.next = null;
            length--;


        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
        

    }

    public Node RemoveFirst(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        
        if(length == 1){
            tail = null;
            length --;
        }

        return temp;
    }

    public Node Get(int index){
        if(index<0 ||index>=length){
            return null;
        }
        Node temp = head;
        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public Boolean Set(int index , int value){
        Node temp = Get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return null;

    }

    public Boolean insert(int index, int value){
         Node newnode = new Node(value);
        
        if(index<0 || index>length){
            return null;
        }
        if(index == 0){
            prepend(value);
            return true;

        }
        if(index == length){
            append(value);
            return true;

        }
        Node temp = Get(index-1);
        newnode.next = temp.next;
        temp.next = newnode;
        length++;
        return true;
       
    }
    public Node remove(int index){
        if(index < 0|| index >= length){
            return null;
        }
        if(index ==0){
           return RemoveFirst();

        }
        if(index == length-1){
            return removeLast();
                
        }
          Node pre = Get(index - 1);
          Node temp = pre.next;
          pre.next = temp.next;
          temp.next = null;
          length--;
          return temp;

        }
    public void Reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0; i<length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
        
    public void printlist(){
        Node current;
        current = head;
        while(current != null){
            System.out.println(current.value);
            current = current.next;

        }

    }
}

    

