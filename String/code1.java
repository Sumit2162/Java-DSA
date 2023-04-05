// package ArrayBMPL;

import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
public class code1{
    public static void main(String[] args)
    {
        // Write your code here
      	Scanner sc = new Scanner(System.in);
      	float p = sc.nextFloat();
      	float r = sc.nextFloat();
      	float t = sc.nextFloat(); 
      	float a;
      	a = (float) (p * Math.pow(1+r/100 , t));
      System.out.print(a);
    }

    // private static float pow(float f, float t) {
        // return ;
    }
// }