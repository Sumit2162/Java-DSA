public class Hollowtriangle {

    public static void main(String[] args) {
        // *
        // * *
        // * * *
        // * * * *
        //  * * * * *
        // int n =5;
        // // int m =5;
        // for(int i = 1; i <= n; i++){
        //     for(int j =1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // *
        // * *
        // *   *
        // *     *
        // * * * * *
        int n=5;
        // int m=5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if(j==1||i==n||i==j){
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