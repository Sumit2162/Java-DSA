package program;

public class HollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=8;
          for(int i= 1;i<=n;i++) {
        	  for(int j=1; j<=n-i+1;j++) {
        		  System.out.print("* ");
        	  }
        	  for(int j= 1;j<=2*i-2; j++) {
        		  System.out.print("  ");
        	  }
        	  for(int j=1; j<=n-i+1; j++) {
        		  System.out.print("* ");
        	  }
        	  System.out.println();
          }
          for(int i=1;i<=n; i++) {
        	  for(int j=1; j<=i; j++) {
        		  System.out.print("* ");
        	  }for(int j=1;j<=n*2-(2*i); j++) {
        		  System.out.print("  ");
        	  }
        	  for(int j=1; j<=i; j++) {
        		  System.out.print("* ");
        	  }
        	  System.out.println();
          }
	}

}
