package RecPractise;

public class Factorial {
    static int CalcFactorial(int n) {
    	if(n==1) {
    		return 1;
    	}
    	int fact_nm1=CalcFactorial(n-1);
    	int fact_n= n*fact_nm1;
    	return fact_n;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int ans= CalcFactorial(5);
        System.out.println(ans);
	}

}
