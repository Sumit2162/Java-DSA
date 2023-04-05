package RecPractise;

public class PrintNumber1 {
  static void PrintNumb(int n) {
	  if(n==7) {
		  return;
	  }
	  System.out.println(n);
	  PrintNumb(n+1);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1;
        PrintNumb(n);
	}

}
