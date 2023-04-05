import java.util.Arrays;

public class DuplicateRemove {
	public static void removeDuplicateSorted(int arr[],int n) {
		Arrays.sort(arr);
		int count =0;
		for(int i=0; i<n; i++) {
			if(arr[i]==arr[i+1]) {
				arr[i]= arr[i+1];
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("repeated digits:"+count);
	}

	public static void main(String[] args) {
        int arr[]= {3,4,6,7,5,7,8,1,9,2,8};
        int n = arr.length-1;
        removeDuplicateSorted(arr,n);
       	}

}
