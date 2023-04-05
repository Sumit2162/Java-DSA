

public class PalindromeSubstring1 {
    static boolean isPalindrome(String str){
        return true;
    }
    public static void palindrome(String str){
        for(int i=0;i<=str.length();i++){
              for(int j=i+1;j<str.length();j++){
                String str_1=str.substring(i,j);    
                if(isPalindrome(str_1)){
                    System.out.println(str_1);

                }
              }
        }
    }
    public static void main(String[] args) {
        String str= "abccbc";
        palindrome(str);
    }
}
