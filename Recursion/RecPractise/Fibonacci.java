package RecPractise;

public class Fibonacci {
	static void CalcFib(int a,int b,int n) {
		if(n==0) {
			return ;
		}
		int c= a+b;
		System.out.print(c+ " ");
		CalcFib(b, c, n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           CalcFib(0,1,9);
	}

}
