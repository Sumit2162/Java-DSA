public class ShowOutputAsLinearRec {
    static void show(int n){
        if(n==0){
            return;
        }
        // Linear recursion
        if(n%2!=0){
        System.out.println(n);
        }
        show(n-1);
        if(n%2==0){
        System.out.println(n);
        }
    }
    public static void main(String[] args) {
        show(5);
    }
}
