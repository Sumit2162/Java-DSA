import java.util.Arrays;

public class RemoveDuplicate {
    public static void remove(int arr[]){
        Arrays.sort(arr);//2,2,4,4,5,5,7,8,9
        int start = 0;
        int end = 1;
        while(start < arr.length && end < arr.length){
            if(arr[start] == arr[end]){
                arr[end] = 0;
                start = end+1;
                end = start+1;
            }
            else{
                start++;
                end++;
            }
        }
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    } 
    public static void main(String[] args) {
        int arr[]= {5,2,4,7,5,8,4,9,2};
        remove(arr);
    }
}
