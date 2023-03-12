import java.util.Scanner;
public class Conditions{
    public static void main(String[] args){
         Scanner scr = new Scanner(System.in);
// System.out.println("helo");
        int a = scr.nextInt();
        int b = scr.nextInt();
 if(a == b){
    System.out.println("equal");
}
else if(a>b){
    System.out.println("a is greater");
}
else{
    System.out.println("a is lesser");
   }
   scr.close();
 }
}