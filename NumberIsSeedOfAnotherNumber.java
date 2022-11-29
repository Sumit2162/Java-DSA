import java.util.Scanner;

public class NumberIsSeedOfAnotherNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number whose will compare to the actual input");
        int y = sc.nextInt();
        int count = 0;
        int num1=x;
        while(x>0) {
        	int rem= x%10;
            x = x/10;
            count = count+1;
              num1 = num1*rem;
        }
        System.out.println("total digits:"+count);
		if(num1==y) {
        	System.out.println("Number is seed");
        }
        else {
        	System.out.println("Number is not seed");
        }
        sc.close();
	}


	}
