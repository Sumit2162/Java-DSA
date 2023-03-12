public class PrimeNum {
    static boolean primenum(int num,int i){
          if(num%i==0){
              return false;
          }
          if(i*i>num){
            return true;
          }
          return primenum(num ,i+1);
    }
    public static void main(String[] args) {
        boolean result = primenum(17,2);
        System.out.println(result);
    }
}
