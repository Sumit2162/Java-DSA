public class P4_MirrorTriangle {
    static void printSpace(int col){
        if(col==0){
            return;
        }
        System.out.print(" ");
        printSpace(col-1);
    }
    static void printStar(int col){
        if(col==0){
            return;
        }
        System.out.print("*");
        printStar(col-1);
    }
    static void printPattern(int row,int col){
        if(row==0){
            return;
        }
        printSpace(row-1);
        printStar(col);
        System.out.println();
        printPattern(row-1,col+1);
    }
    public static void main(String[] args) {
        printPattern(5,1);
    }
}
//     *
//    **
//   ***
//  ****
// *****
