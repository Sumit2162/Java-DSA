package program;

public class HalfDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n = 10;
      for(int i = 1; i<=n; i++) {
    	  for(int j = 1; j<= i; j++ ) {
    		  System.out.print("* ");
    	  }
    	  System.out.println();
      }for(int i=1; i<=n+1;i++) {
    	  System.out.print("* ");
      }System.out.println();
      
      for(int i = 1; i<=n; i++) {
       for(int j = 1;j<=n-i+1;j++) {
    		  System.out.print("* ");
    	  }
    	  System.out.println();
      }
	}
}
	
