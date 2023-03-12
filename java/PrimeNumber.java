
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        int n = I.nextInt();
        // int n = 23;
        boolean prime = true;
        if(n % 2 == 0 || n % 3 == 0){
        prime =  false;
        }
        int iter = 0;
        for(int i = 5; i*i<n; i+=6 ){
            iter++;
            if(n % i == 0 || n%i+2 == 0){
                System.out.println("number is not prime");
            }
        }
            
        if(prime){
            System.out.println(" prime");
        }
        else{
            System.out.println(" not prime");
        }
        

        System.out.println("number of iterations: " +iter);

        I.close();
    

    }
    
}
