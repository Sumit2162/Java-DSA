
public class palindromeSubstring {
	static boolean isPalindrome(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	static void substring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String substr= str.substring(i, j);
				if(isPalindrome(substr)) {
					System.out.println(substr);
				}
			}
		}
	}
       public static void main(String[] args) {
		 String str= "abccbc";
		 substring(str);
	}
}
