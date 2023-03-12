
import java.util.*;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner sumit = new Scanner(System.in);
        System.out.println("enter the amount");
        float amount = sumit.nextInt();
        System.out.println("enter the rate");
        float rate = sumit.nextInt();
        System.out.println("enter the time");
        float time = sumit.nextInt();
        float SI = (amount*rate*time)/1000;
            System.out.println(SI);
            sumit.close();
    }
    
}
