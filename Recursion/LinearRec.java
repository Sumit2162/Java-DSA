public class LinearRec {
    static void show(int n){
        if(n==0){
            return;
        }
        // Linear recursion
        
        System.out.println(n);
        show(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        show(6);
    }
}
