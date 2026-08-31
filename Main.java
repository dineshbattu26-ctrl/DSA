


public class Main{
public static void main(String[] args){

    Linked mylist = new Linked(10);
     mylist.append(20);
     mylist.append(30);
     mylist.prepend(5);
     mylist.append(40);
     mylist.printlist();
     mylist.removeLast();
     mylist.RemoveFirst();

     System.out.println("\nafter removed :" );

     mylist.printlist();

    System.out.println(mylist.Get(2).value);

     mylist.Set(1,100);
     
     mylist.printlist();



     mylist.insert(2,40);
     System.out.println("\nafter insert:" );
     mylist.printlist();
     System.out.println("\nafter remove");
     mylist.remove(3);
     mylist.printlist();

     


     
}


}
    

