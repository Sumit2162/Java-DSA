public class SnakeMatrixSelf {
    static void snake(int matrix[][]){
        int startrow=0;
        int endrow=matrix.length;
        int startcol=0;
        int endcol=matrix[0].length;
        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<endcol;j++){
                System.out.print(matrix[startrow][j]);
            }
            for(int j=endcol-1;j>=startcol;j--){
                System.out.print(matrix[startrow+1][j]);
            }
            for(int j=startcol;j<endcol;j++){
                System.out.print(matrix[startrow+2][j]);
            }
            for(int j=endcol-1;j>=startcol;j--){
                System.out.print(matrix[startrow+3][j]);
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
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
