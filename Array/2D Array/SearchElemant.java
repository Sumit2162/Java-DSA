import java.util.*;
public class SearchElemant {
    public static boolean search(int matrix[][],int searchvalue){
          for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                  if(matrix[i][j]==searchvalue){
                    System.out.println("value found at cell:"+"("+i+","+j+")");
                    return true;
                  }
            }
          }
          System.out.println("Not found");
          return false;

    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int searchvalue=56;
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix value");
        // for input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        ///for output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("["+matrix[i][j]+" "+"]");
            }
            System.out.println();
        }
        search(matrix,searchvalue);

        sc.close();
    }
}
