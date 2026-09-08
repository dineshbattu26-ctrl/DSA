import java.util.Scanner;
class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
        
            num=sc.nextInt();
            num++;
            System.out.println("num : " +(num));

        }while(num<100);
        }
    }