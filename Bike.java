public class Bike {
    String name;
    String color;
    int price;
 Bike(String n,String c,int p){
    name = n;
    color = c;
    price = p;
 }


void display(){
    System.out.println(name);
    System.out.println(color);
    System.out.println(price);

}
public static void main(String[] args){
    Bike b1 = new Bike("pulsor","black",10000);
    Bike b2 = new Bike("apache","white",15000);

    b1.display();
    b2.display();
}
}
