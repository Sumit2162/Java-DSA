

public class Moore {
    public static int maj(int arr[]) {
        int count=1;
        int majo=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==majo){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                majo=arr[i];
                count =1;
            }
            if(count>arr.length/2){
                return i;
            }
        }
        return majo;

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,3};
        // System.out.println(maj(arr));
      int res=  maj(arr);
      System.out.println(res);
    }
}
