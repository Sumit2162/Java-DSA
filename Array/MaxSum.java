public class MaxSum {
    public static void maxSum(int arr[],int k){
        int maxsum = 0;
        for(int i=0;i<arr.length-k;i++){
            int sum=0;
             for(int j=0;j<k;j++){
                sum= sum+arr[i+j];
             }
             if(sum>maxsum){
                maxsum=sum;
             }
        }
        System.out.println("maxsum: "+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={1,40,30,10,20,5};
        int k= 3;
        maxSum(arr, k);
    }
}
