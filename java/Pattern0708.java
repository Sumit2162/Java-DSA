public class Pattern0708{
    public static void main(String[] args) {
        int n = 5;
        // int m = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for(int j=1;  j<=(n*2-(2*i-1)); j++){
                if(j==1||i==1||j==(n*2-(2*i-1)) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
