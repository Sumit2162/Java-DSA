public class TrapingRainWater {
    // public static void TrapingRainWater(int arr[]){
    // int total=0;
// }
     public static void main(String[] args) {
        int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
        int n=arr.length;
        int pmax[] =new int[n];
        pmax[0]=arr[0];
        for(int i=1;i<n;i++){
           pmax[i]=Math.max(pmax[i-1],arr[i]);
        }
        int smax[]= new int[n];
        smax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
          smax[i]=Math.max(smax[i+1], arr[i]);
        }
        int amount = 0;
        for(int i=0;i<n;i++){
            int current =arr[i];
            int left = pmax[i];
            int right = smax[i];
            int minHeight = Math.min(left, right);
            if(minHeight>current){
 
                amount += minHeight-current;
            }
        }
        System.out.println("total amount :"+amount);
    }
}
