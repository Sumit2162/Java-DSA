public class Pattern0705 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j =n; j>=i; j-- )
            {
                if(j==i||i==1||j==m ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
    }
}
}

