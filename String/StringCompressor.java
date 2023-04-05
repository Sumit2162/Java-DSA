public class StringCompressor {
    public static String compress(String str){
         StringBuilder newstr= new StringBuilder("");
         for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1));{
                count++;
                i++;
            }
            System.out.println(count);
            newstr.append(str.charAt(i));
            if(count>1){
               newstr.append(count.toString());
            }
         }
         return newstr.toString();
    }
    public static void main(String[] args) {
        String str="aaabbf";
        // compress(str);
        System.out.println(compress(str));
    }
}
