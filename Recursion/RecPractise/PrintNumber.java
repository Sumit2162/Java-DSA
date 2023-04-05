package RecPractise;

public class PrintNumber {
     static void PrintNumb(int n) {
    	 if(n==0) {
    		 return;
    	 }
    	 System.out.println(n);
    	 PrintNumb(n-1);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 6;
         PrintNumb(n);
	}

}
