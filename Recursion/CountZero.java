public class CountZero {
    static int countzero(int num,int count){
        if(num==0){
            return count;
        }
        if(num%10==0){
            count++;
            
        }
        return countzero(num/10,count);
    }
    public static void main(String[] args) {
        System.out.println(countzero(109020,0) );
    }
}
