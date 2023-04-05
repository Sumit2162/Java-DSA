public class DiagonalSumOptimize {
  public static int diagonal(int matrix[][]){
    int sum =0;
    for(int i=0;i<matrix.length;i++){
        sum+=matrix[i][i];
        if(i!=matrix.length-1-i)
        sum+=matrix[i][matrix.length-1-i];
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
            System.out.println("Diagonal sum is: "+diagonal(matrix));
    }
}
