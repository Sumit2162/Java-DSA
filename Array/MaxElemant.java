public class MaxElemant {
    static void Array(int arr[],int n){
        boolean isMax;
        for(int i = 0; i<n; i++){
            isMax= true;
            for(int j=0;j<n; j++){
                if(arr[j]>arr[i]){
                    isMax = false;
                    break;
                }
            }
            if(isMax){
                System.out.println("Max elemant is : " +arr[i]);
                return;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] ={3,5,8,2,5,8,9,};
        int n= arr.length;
        Array(arr,n);
    }
}
