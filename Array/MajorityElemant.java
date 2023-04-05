public class MajorityElemant {
    public static int Aproach_1(int arr[],int n){
    //    for(int i= 0;i<n;i++){
    //    }
    for(int i:arr){
        int count =0;
        for(int e:arr){
            if(i==e){
                count+=1;
            }
        }
        if(count>n/2){
            return i;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int arr[]= {2,2,1,1,1,2,2};
        int n= arr.length;
        Aproach_1(arr, n);
        System.out.println(Aproach_1(arr, n));
    }
}
