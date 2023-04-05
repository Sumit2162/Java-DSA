public class SubArraySum {
    public static void subArraySum(int arr[],int target){
        int sum=0;
           for(int i=0;i<arr.length;i++){
               sum+=arr[i];
           }
           if(sum==target){

           }
           else if(sum<target){

           }
           else if(sum>target){
            sum=sum-arr[i];
           }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int target = 90;
        subArraySum(arr, target);
    }
}
