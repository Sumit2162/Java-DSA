import java.util.Scanner;

public class PalindromeNumber {
      public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter number");
	     int num = sc.nextInt();
	     int num1 = num;
	     int rev = 0;
	     while(num1>0) {
	    	 int rem = num1%10;
	    	 num1 = num1/10;
	    	 rev = rev*10+rem;
	     }
	     if(rev == num) {
	    	 System.out.println(num+" is s pallindrom number.");
	     }
	     else {
	    	 System.out.println(num+" is not a pallindrom number.");
	     }
	     sc.close();
}
}
