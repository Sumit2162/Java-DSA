import java.util.Scanner;

public class SumNNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Number ");
          int n = sc.nextInt();
          int sum=0;
          for(int i=0; i<=n; i++) {
        	  sum=sum+i;
          }
          {
        	  System.out.println("Sum is: "+sum);
          }
          sc.close();
	}
}
