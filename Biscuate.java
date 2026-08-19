public class Biscuate {
    String name;
    String color;
    int price;

void setDetails(String n,String c, int p){
    name = n;
    color = c;
    price = p;
}

String getDetails(){
    return 
    name + " " +color +" " + price ;
}

public static void main(String[] args){
    Biscuate b1 = new Biscuate();
    Biscuate b2 = new Biscuate();


    b1.setDetails("chocolate","brown",10);
    b2.setDetails("coffie","light brown",15);

    System.out.println(b1.getDetails());
    System.out.println(b2.getDetails());


}
}

