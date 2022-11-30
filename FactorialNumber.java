import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int n = sc.nextInt();
        int fact = 1;
        if(n==0 || n==1) {
        	System.out.println("Factorial is: "+fact);
        }
        else {
        	 while(n>1) {
             	fact = fact*n;
             	n--;
             	
             }
        System.out.println("Factorial is: "+fact);
        }
       sc.close();
	}
}
