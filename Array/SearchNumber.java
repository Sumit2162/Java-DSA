import java.util.Scanner;

public class SearchNumber {

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
        System.out.println("searching elemant");
        int x= sc.nextInt();
        for(int i=0;i<numbers.length;i++) {
        	if(numbers[i]==x) {
        		System.out.println("x found at index :"+ i);
        	}
        }
	}
	}


