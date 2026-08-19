public class Car {
    String name;
    String color;
    int price;

    void setDetails(String n,String c,int p){
        name = n;
        color = c;
        price = p;
    }
     String getDetails(){
        return name +" " + color +" " +price;
     }

     public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car();

    c1.setDetails("BMW","black",1000000);
    c2.setDetails("Audi","white",2000000);

    System.out.println(c1.getDetails());
    System.out.println(c2.getDetails());
     }


    
}
