package program;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 10;
       for(int i = 1; i<=n; i++) {
    	   for(int j = i; j<=n; j++) {
    		   System.out.print("  ");
    	   }
    	   {
    		   for(int j = 1; j<=n; j++) 
    		   if(i==n||j==n||i==1||j==1||i==n/2&&j==n/2)
    		   {
    			   System.out.print("* ");
    		   }
    		   else {
    			   System.out.print("  ");
    		   }
    	   }
    	   System.out.println();
       }
	}
}
