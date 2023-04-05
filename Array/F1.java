import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i =0; i<size;i++) {
        	System.out.println("enter elemants");
        	numbers[i]= sc.nextInt();
        }
        for(int i=0;i<size;i++) {
        	System.out.println(numbers[i]);	
        }
        sc.close();

	}
}
