public class SumNNumber {
    static void Sum(int i,int n,int sum){
        if(n==i){
            sum=sum+i;

            System.out.println(sum);
            return;
        }
        sum=sum+i;
       Sum(i+1,n,sum);
    }
    public static void main(String[] args) {
        Sum(1,3,0);
    }
}
