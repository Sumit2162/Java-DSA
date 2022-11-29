import java.util.Scanner;

public class CheckNumberIsDivisibleBySumOfItsDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int count = 0;
        int num1=num;
        int sumdigits=0;
        while(num>0) {
        	int rem= num%10;
            num = num/10;
            count = count+1;
            sumdigits= sumdigits+rem;
        }
        System.out.println("total digits:"+count);
        System.out.println("sum of digits :"+sumdigits);

        if(num1%sumdigits==0) {
        	System.out.println("number is divisible by sum of its digits");
        }
        else {
        	System.out.println("not divisible");
        }
        sc.close();
	}
}
