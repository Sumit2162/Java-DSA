import java.util.*;
public class collegeQ1 {
    public static void main(String[] args) {
        Scanner Sumit = new Scanner(System.in);
        int age = Sumit.nextInt();
        if(age<19){
            System.out.println("he/she can not apply for drivings");
        }
        else if(age>=19){
            System.out.println("apply for drivings");
        }
        else{
            System.out.println("child not apply");
        }
        Sumit.close();
        }
    }

