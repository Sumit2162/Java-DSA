
public class BinarySearchPRTC {
	public static int Search(int arr[], int search) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==search) {
				return mid;
			}
			if(arr[mid]<search) {
				start =mid +1;
			}
			else if (arr[mid]>search) {
				end = mid-1;
			}
		}
		return -1 ;
	}
    public static void main(String[] args) {
		int arr[]= {20,30,40,50,60,70};
		int search = 35;
		System.out.println("number found at index :"+Search(arr, search));
	}
}
