import java.util.*;
public class CheckCharacterVowelConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        System.out.println("press any key");
        char sumit = ((sc.nextLine()).charAt(0));
        if(sumit=='a'||sumit=='e'||sumit=='i'||sumit=='o'||sumit=='u') {
        	System.out.println("this is vowel");
        }
        else if(sumit=='A'||sumit=='E'||sumit=='I'||sumit=='O'||sumit=='U') {
        	System.out.println("this is vowel");
        }
        else {
        	System.out.println("this is constant");
        }
        sc.close();
	}

}
