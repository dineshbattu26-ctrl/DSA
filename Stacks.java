public class Stacks {
    Node top;
    int height;

    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

Stacks(int value){

    Node newnode = new Node(value);
    top = newnode;
     height = 1;
    }

public void push(int value){
    Node newnode = new Node(value);
    if(height == 0){
        newnode = top;
    }else{
        newnode.next = top;
        top = newnode;
    }
    height++;
}

public Node pop(){
    if(height == 0)return null;
    
    Node temp = top;
    top = temp.next;
    temp.next = null;
    
    height--;
    return temp;
    
}



public void printstack(){
    Node temp = top;
    while(temp != null){
        System.out.println(temp.value);
        temp = temp.next;
        
    }
    
}

public static void main (String[] args){

    Stacks mystack = new Stacks(4);
    mystack.push(1);
    mystack.push(2);
    mystack.push(3);
    

    mystack.printstack();
}
 
    
}
