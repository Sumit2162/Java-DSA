public class DigonalSumBruteAproach {
    public static int digonal(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                   sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={
            {2,3,4,5,4},
            {6,7,8,9,5},
            {10,11,12,13,52},
            {14,15,16,17,74},
            {69,44,25,87,14}};
            // digonal(matrix);
            System.out.println("Diagonal sum is: "+digonal(matrix));
    }
}
