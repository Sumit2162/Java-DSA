public class RSum1 {
    static int Sum(int a,int b,int sum){
if(sum ==a+b){
    return 0;
}
     sum = a+b;
     return Sum(a, b, sum);
    }
    public static void main(String[] args) {
        Sum(21, 21, 0);
    }
}
