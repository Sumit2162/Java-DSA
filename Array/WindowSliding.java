public class WindowSliding {
    public static void maxSum(int arr[],int k){

        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
         int maxsum=sum;
             for(int i=k;i<arr.length;i++){
                maxsum+= arr[i]-arr[i-k];
             }
             if(sum>maxsum){
                maxsum=sum;
             }
            
             System.out.println("maxsum: "+maxsum);
    }
    
    
        public static void main(String[] args) {
            int arr[]={1,40,30,10,20,5};
            int k= 3;
            maxSum(arr, k);
        }
    }



    

