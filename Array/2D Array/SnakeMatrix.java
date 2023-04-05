public class SnakeMatrix {
    public static void snake(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            if(i%2==0){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+",");
            }
            }
            else{
                for(int j=matrix[0].length-1;j>=0;j--){
                    System.out.print(matrix[i][j]+",");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        snake(matrix);
    }
    
}
