import java.util.Scanner;

public class CheckCharacterUppercaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char ");
        char s = (sc.nextLine().charAt(0));
        if(s>='a' && s<='z') {
        	System.out.println("this is Lower case");
        }
        else if(s>='A' && s<='Z') {
        	System.out.println("this is Upper case");
        }
        else {
        	System.out.println(" invalid char");
        }
        sc.close();
	}

}
