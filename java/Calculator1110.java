import java.util.Scanner;
public class Calculator1110 {
    public static void main(String[] args) {
        int operator,result;
        Scanner num = new Scanner(System.in);
        System.out.println("enter the two number");
        int number1 = num.nextInt();
        int number2 = num.nextInt();
        System.out.println("select operations");
        System.out.println("press 1 for addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        operator= num.nextInt();
    switch(operator) { 
        case 1:{
                result = number1+number2;
                System.out.println(result);
                break;
        }
        case 2 :{
            result = number1-number2;
            System.out.println(result);
            break;
        }
        case 3:{
            result = number1*number2;
            System.out.println(result);
            break;
        }
        case 4:{
            result = number1/number2;
            System.out.println(result);
            break;
        }
        default:
    }
        num.close();
}
}

