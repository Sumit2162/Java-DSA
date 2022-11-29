import java.util.Scanner;

public class ArmstongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int num1= num;
        int count = 0;
        int SumCubedigits = 0;
        while(num>0) {
        	int rem = num%10;
        	SumCubedigits = SumCubedigits+rem*rem*rem;
        	num= num/10;
        	count =count+1;
        }
    	System.out.println("total digits: "+count);

        if(num1==SumCubedigits) {
        	System.out.println("ArmstongNumber");
	}
	else {
		System.out.println("Not ArmstongNumber");
	}
        sc.close();
	}
}
