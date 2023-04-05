import java.util.Arrays;

public class PairSumPointer {
    static void pair(int arr[],int k){
        Arrays.sort(arr);//{1,3,5,6,7,9}
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,7,6,9};
        int k= 11;
        pair(arr,k);
    }
}
