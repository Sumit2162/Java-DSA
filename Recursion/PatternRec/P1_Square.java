public class P1_Square {
    static void printstar(int col){
        if(col==0){
            // System.out.println("*");
            return;
        }
        System.out.print("*");
        printstar(col-1);
    }
    static void printPattern(int row,int col){
       if(row==0){
        return;
       }
       printstar(col);
       System.out.println();
       printPattern(row-1,col);
    }
    public static void main(String[] args) {
        printPattern(5, 5);
    }
}
// *****
// *****
// *****
// *****
// *****