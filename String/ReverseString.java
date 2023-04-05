
public class ReverseString {
	public static void reverse(char[] str) {
		int start=0;
		int end = str.length-1;
		while(start<end) {
			char temp= str[start];
			str[start]=str[end];
			str[end]=temp;
			start++;
			end--;
		}
		
		
	}
    public static void main(String[] args) {
		char str[]= {'s','u','m','i','t'};
		reverse(str);
		int n=str.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(str[i]);
		}
	}
}
