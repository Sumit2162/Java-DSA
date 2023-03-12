import java.util.*;
public class CollegeQ3 {
    public static void main(String[] args) {
        // double selling price, cost price;
        Scanner sc =  new Scanner(System.in);
        System.out.println(" enter cost price");
        System.out.println("enter selling price");
        int cp = sc.nextInt();
        int  sp = sc.nextInt();
        if(sp-cp>=0){
            System.out.println("profit");
        }
        else{
            System.out.println("loss");
        }
        sc.close();
    }
}
