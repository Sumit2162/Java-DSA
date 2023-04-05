import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWord {
    static void reverse(String str){
         str=str.trim();
         String[] words= str.split("");//if we give here nospace then it's o/p will be revrse of given string(sumit=timus)
         List<String> wordList=Arrays.asList(words);
         Collections.reverse(wordList);
         String result = String.join(" ",wordList);
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str="hii sumit tomar";
        reverse(str);
    }
}
