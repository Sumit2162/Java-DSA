import java.util.Arrays;

public class BinarySearch {
	public static int binarysearch(int numbers[] , int key ) {
		Arrays.sort(numbers);// {1,2,3,4,5,6,8,9}
		int start =0;
		int end= numbers.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
		
		if(numbers[mid]==key) {
			return mid;
		}
		if(numbers[mid]<key) {
			start = mid+1;
		}
		else {
			end = mid-1;
		}
	}
		return -1;
	}

	public static void main(String[] args) {
         int numbers[]= {5,3,6,2,8,1,4,9};
         int key = 2;
         System.out.println("search number found at index: "+binarysearch(numbers, key));
	}

}
