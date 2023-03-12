package program;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double n =557;
		int num = 0;
		System.out.println("enter number ");
		for(int i=1;i<=n;i++)
		if(i%2!=0) {
			System.out.println("odd number is:" +i);
			num = num+1;
		}
System.out.println("count = "+num);
	}

}
