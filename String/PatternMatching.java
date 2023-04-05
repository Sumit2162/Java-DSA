public class PatternMatching {
    static String pattern(String str,String pat){
        int n=str.length();
        int m= pat.length();
        for(int i=0;i<n-m;i++ ){
            int j;
            for( j=0;j<m;j++){
                if(str.charAt(i+j)!=pat.charAt(j)){
                   break;
                }
            }
            if(j==m){
                System.out.println("Pattern found at: "+i);
            }
        }
        return 
    }
    public static void main(String[] args) {
        String str="ABCCBDABCD";
        String pat= "ABC";
        String result =pattern(str, pat);
       System.out.println(result);
    }
}
