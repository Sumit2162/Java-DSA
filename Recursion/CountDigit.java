public class CountDigit {
    static void countdigit(int num,int count){
if(num==0){
    System.out.println(count);
    return;
}
countdigit(num/10, count+1);
    }
    public static void main(String[] args) {
        
        countdigit(23444,0);
    }
}
