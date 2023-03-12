package HashMap;

public class ReplacePi {
    static String replace(String str,int index){
         if(index ==str.length()){
            return "";
         }
         if(str.charAt(index)=='p' && str.charAt(index+1)=='i'){
            return "3.14" + replace(str, index+2);
         }
         else{
            return str.charAt(index) + replace(str, index+1);
         }
    }
    public static void main(String[] args) {
        String str = "2+pi*5/pi-pi";
        // String output = replace(str, 0);
        String output = replace(str, 0);
        System.out.println(output);
    }
}
