import java.util.Scanner;
public class Evenodd{
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
int x = Scanner.nextInt();
if((x&1) == 1){
    System.out.println("odd");
}
else {
    System.out.println("even");
}
Scanner.close();
}
}
