import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    Scanner Sumit = new Scanner(System.in);
    System.out.println("enter the value");
    int a= Sumit.nextInt();
    boolean prime = true;
        if(a%2==0||a%3==0){
            prime= false;
        }
        Sumit.close();
    }
}

