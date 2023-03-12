public class RSum {
    static void Sum(int a, int b, int sum){
if(sum==a+b){
    System.out.println(sum);
    return;
}
sum= a+b;

 Sum(a,b,sum);
    } 
    public static void main(String[] args) {
        Sum(5,3,0);
    }
}
