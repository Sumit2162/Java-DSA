public class LeaderElemant {
    public static void leaderelemant(int arr[]){
         for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]<=arr[j])
                break;
            }
            if(arr[i]==arr.length){
                System.out.println(arr[i]);
            }
         }
         return;
    }
    public static void main(String[] args) {
        int arr[]= {3,5,12,4,34,6,8};
        // int n=arr.length;
        leaderelemant(arr);
    }
}
