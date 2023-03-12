

public class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        int temp = number;
        int sum = 0;
        while(number%10!=0){
            int rem = number%10;
            sum+= Math.pow(rem,3);
            number = number/10;
        }
            if(sum ==temp){
                System.out.println("armstrong number");
            }
            else{
                System.out.println("not armstrong ");
            }
    }
    
}
