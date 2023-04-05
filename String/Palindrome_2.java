
public class Palindrome_2 {
	static boolean isPalindrome(String str) {
		int begin =0;
		int end=str.length()-1;
		while(begin<end) {
			if(str.charAt(begin)!=str.charAt(end)){
				return false;
			}
			begin++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
        String str= "SSJT";
		System.out.println(isPalindrome(str));
	}

}
