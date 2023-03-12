public class Pattern0702 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for(int i = 1; i<=n; i++){
            for(int j =m; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
    }
}
}
