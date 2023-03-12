package program;


import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("enter the number");
		while(n>0)
			rev = rev*10+n%10;
		n = n/10;{
			System.out.println(rev);
		}
		sc.close();
	}
}
