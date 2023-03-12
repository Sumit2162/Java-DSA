public class P1{
    static void Sum(int n, int m,int sum){
       if(sum==n+m){
       System.out.println(sum);
        return ;
       }
       sum=n+m;
       Sum(n,m,sum);
    }

    public static void main(String[] args) {
        
        Sum(4, 9, 0);
    }

}