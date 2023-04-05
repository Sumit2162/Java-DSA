public class SmallerAllNumber {
    public static void Smaller(int arr[],int n){
        int count =0;
          for(int i =0;i<n;i++){
              for(int j=1; j<n;j++){
                if(arr[i]>arr[j]){
                    System.out.println("Smaller:"+ arr[j]);
                    count++;
                }
                System.out.println(count);
              }
          }
    }
    public static void main(String[] args) {
        int arr[]={8,1,2,2,3};
        int n = arr.length;
    }
}
