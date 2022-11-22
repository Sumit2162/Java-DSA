import java.util.Scanner;

public class CheckCharacterDigitSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter char ");
	        char s = (sc.nextLine().charAt(0));
	        if(s>='a' && s<='z'||s>='A' && s<='Z') {
	        	System.out.println("this is character");
	        }
	        else if(s>='0' && s<='9') {
	        	System.out.println("this is digit");
	        }
	        else {
	        	System.out.println("this is special character");
	        }
	        sc.close();
	}

}
