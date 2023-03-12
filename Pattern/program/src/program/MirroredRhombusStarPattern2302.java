package program;

public class MirroredRhombusStarPattern2302 {
        public static void main(String[] args) {
        	 int n = 10;
             for(int i = 1; i<=n; i++) {
          	   for(int j = 1; j<=i; j++) {
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

