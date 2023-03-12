public class TailRec {
    static void show(int n){
        if(n==0){
            return;
        }
        // Tail recursion
        System.out.println(n);
        show(n-1);
    }
    public static void main(String[] args) {
        show(6);
    }
}
