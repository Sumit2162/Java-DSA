
public class PalindromeString {
    static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }
    public static void main(String[] args) {
        String str="cbc";
        System.out.println(isPalindrome(str));
    }
}
