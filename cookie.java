class Cookie{
    String name;
    String color;
    int price;
    String shape;

Cookie(String n, String c, int p, String s){
    name = n;
    color = c;
    price = p;
    shape = s;
}
void display(){
    System.out.println( "Cookie Name:" + name);
    System.out.println("Cookie Color:" + color);
    System.out.println("Cookie Price:" + price);
    System.out.println("Cookie Shape:" + shape);
}
public static void main(String[] args){
    Cookie c1 = new Cookie("chocolate chip","browny black",10,"round");
    Cookie c2 = new Cookie("coffie cookies","light brown",15,"oval" );
    
    c1.display();
    c2.display();
}
}