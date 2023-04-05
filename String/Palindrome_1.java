
public class Palindrome_1 {
	static boolean isPalindrome(String name) {
		StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        return name.equals(sb.toString());
	}
     public static void main(String[] args) {
		String name="Sumit";
		System.out.println(isPalindrome(name));
	}
}
