package RecPractise;

public class SumN {
    public static void PrintSum(int i, int n ,int sum) {
    	if(n==i) {
        	sum = sum +i;
        	System.out.println(sum);

    		return ;
    	}
          sum+=i;
    	 PrintSum(i+1,n,sum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         int n= 5;
         PrintSum(1,5,0);
	}

}
