import java.util.*;
public class Calculator
 {
    public static void main(String[] args){
        int operator;
        int number1,number2,result;
        Scanner sc = new Scanner(System.in);
       // int a = sc.nextInt();
       // int b = sc.nextInt();
        System.out.println("enter first number");
        number1 = sc.nextInt();
        System.out.println("enter second number  ");
        number2 = sc.nextInt();
        System.out.println("Select Operation:");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for divide");
        System.out.println("Press 4 for multiply");
        operator=sc.nextInt();
    //choose operator

switch(operator){
    case 1:{
        result=number1+number2;
        System.out.println("Addition: "+result);
        break;
    }
    case 2:{
        result=number1-number2;
        System.out.println("Subtraction: "+result);
        break;
    }
    case 3:{
        result=number1/number2;
        System.out.println("Division: "+result);
        break;
    }  
    case 4:{
        result=number1*number2;
        System.out.println("Multiplication: "+result);
        break;
    }
    default:

}
sc.close();


    }
    
}
