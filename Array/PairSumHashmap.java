import java.util.HashMap;

public class PairSumHashmap {
    static void pair(int arr[],int k){
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int i=0;i<=arr.length;i++){
            if(map.get(arr[i])==null){
            map.put( k-arr[i],arr[i]);
            }
        
        else{
            System.out.println(map.get(arr[i])+ ", "+arr[i]);
            return;
        }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,7,6,9};
        int k= 11;
        pair(arr,k);
    }
}
