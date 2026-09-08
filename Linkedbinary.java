public class Linkedbinary {
    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node next;
    
    

    Node(int value){
        this.value = value;
    }
}


    Linkedbinary( int value){
        Node newnode = new Node(value);
        head = newnode;
        tail = newnode;
        length = 1;
        
    }


    public void append(int value){
        Node newnode = new Node(value);
        if(length == 0){
        head = newnode;
        tail = newnode;
            
        }else{
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
        }else{
            newnode.next = head;
            head = newnode;
        }
        length++;
        }


        public int binarytoDecimal(){
            Node current = head;

            if(current == null){
                return 0 ;
            }

            int answer = 0;
            while(current != null){
                if(current.value == 1 || current.value == 0){
                    answer = answer*2 + current.value;

                }

                current = current.next;
                }
                return answer;

            }


            public void partitionList(int x){
                Node current = head;

                Node dummy1 = new Node(x);
                Node dummy2 = new Node(x);
                Node prev1 = dummy1;
                Node prev2 = dummy2;

                while(current != null){
                    if(current.value >= x){
                        prev2.next = current;
                        prev2 = current;
                    }else {
                        prev1.next = current;
                        prev1 = current;
                    }

                    current = current.next;
                }
                    
                prev1.next = dummy2.next;
                head = dummy1.next;
                prev2.next = null;

            }
        
            public void swappair(){
                Node dummy = new Node(0);
                dummy.next = head;
                Node first = head;
                Node prev = dummy;

                while(first != null && first.next != null){
                    Node second = first.next;

                    prev.next = second;
                    first.next = second.next;
                    second.next = first;

                    prev= first;
                    first = prev.next;

                    if(first != null){

                        second = first.next;
                    }

                }

                head = dummy.next;
            }


    
        public void printlist(){
            Node current = head;
            for(int i = 0; i<length; i++){

                System.out.println(current.value);
                current = current.next;
            
            }
        }
    
    public static void main(String[] args){

        Linkedbinary mylist;


        mylist = new Linkedbinary(1);
        mylist.append(0);
        mylist.append(1);
        mylist.prepend(1);
        mylist.append(1);

        System.out.println("\n Listed list:");
        mylist.printlist();

        int decimal = mylist.binarytoDecimal();
        System.out.println("\nDecimal value of binary linked list is:"+decimal);





        mylist = new Linkedbinary(2);
        mylist.append(9);
        mylist.append(7);
        mylist.append(5);
        mylist.prepend(3);
        mylist.append(8);
        mylist.append(15);




        System.out.println("\n linked list after partitioning around 7:");
        mylist.partitionList(7);
        mylist.printlist();


        mylist  = new Linkedbinary(1);
        mylist.append(7);
        mylist.append(3);
        mylist.append(8);
        mylist.append(3);
        mylist.append(5);
        System.out.println("\n Linked before swapping pairs:");
        mylist.printlist();
        mylist.swappair();
        System.out.println("\n Linked after swapping pairs:");
        mylist.printlist();



    }

}
