public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 153;
        int temp=num;
        int result =0;
        while(num!=0){
            num = num % 10*3;
            result += num;
            num= num/10;
        }
        if(result==temp){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not Armstrong");
        }
        
    }
}
