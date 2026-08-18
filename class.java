class Class{
    String name;
    int age;
    Class(String s, int n){
        name = s;
        age = n;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
public static void main(String[] args) {
 Class s1 = new Class("Dinesh",19);
    s1.display();
    }
}
