package program;

public class MirroredHalfDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n= 6;
         for(int i =1;i<=n;i++) {
        	 for(int j= 1;j<=n-i+1;j++) {
        		 System.out.print("  ");
        	 }
        	 for(int j=1;j<=i;j++) {
        		 System.out.print("* ");
        	 }
        	 System.out.println();
         }
         {
        	 for(int j=1;j<=n+1;j++) {
        		 System.out.print("* ");
        	 }System.out.println();
         }{
        	 for(int i=1;i<=n;i++) {
        	 for(int j=1;j<=i;j++) {
        		 System.out.print("  ");
        	 }
        	 for(int j=1;j<=n-i+1;j++) {
        		 System.out.print("* ");
        	 }
        	 System.out.println();
         }
	}
	}
}
