public class RAbinKarp {
    public static void main(String[] args) {
        String str="CABCDBABCCD";
        String pat="ABC";
        int n= str.length();
        int m=pat.length();
        int d=5;
        int q=13;
        int stringHash=0;
        int patHash=0;
        for(int i=0;i<m;i++){
            patHash=(patHash*d+pat.charAt(i))%q;
            stringHash=(stringHash*d+str.charAt(i))%q;

        }
        for(int i=0;i<n-m;i++){
            if(patHash==stringHash){
               int j;
              for(j=0;j<m;j++){
                if(str.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
             }
             if(j==m){
                System.out.println("Pattern found at:"+i);
             }
            }
            if(i<n-m){
                // remove previous character hash
                stringHash=stringHash-str.charAt(i)*d;
                // add next character hash
                stringHash=(stringHash*d+str.charAt(i+m))%q;
                if(stringHash<0){
                    stringHash=stringHash+q;
                }
            }
        }
    }
}
