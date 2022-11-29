import java.util.Scanner;

public class SumNNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter Number ");
         float n = sc.nextInt();
         float sum=0;
         for(float i=1; i<=n; i++) {
       	  sum=sum+1/i;
         }
         {
       	  System.out.println("Sum is: "+sum);
         }
         sc.close();
	}

}
