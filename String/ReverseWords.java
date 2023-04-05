
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class ReverseWords {
    static void reverse(String str){
        str = str.trim();
        String[] words= str.split(" ");//if we give here a space then it's o/p will be reverse of given string(sumit tomar = tomar sumit)
        List<String> wordlist = Arrays.asList(words);
        Collections.reverse(wordlist);
        String result = String.join(" ",wordlist);
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str= " hello sumit tomar  ";
        reverse(str);
    }
}
