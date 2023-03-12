package program;

public class Shivamhollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n =9;
       for(int i = 1;i<=n;i++) {
    	   for(int j=1;j<=n-i+1;j++) {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<=2*i-1;j++)
    	   if(i==n||j==1||j==2*i-1){
    		   System.out.print("*");
    	   }
    	   else {
    		   System.out.print(" ");
    	   }
    	   System.out.println();
       }
       for(int i=1;i<=n;i++) {
    	   for(int j=1;j<=i+1;j++) {
    		   System.out.print(" ");
    	   }
    	   for(int j=2*n-2*i-1;j>=1;j--)
    	   if(j==1||j==2*n-2*i-1){
    		   System.out.print("*");
    	   }
    	   else {
    		   System.out.print(" ");
    	   }
    	   System.out.println();
       
	}
}
}
