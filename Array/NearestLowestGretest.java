
public class NearestLowestGretest {
	public static int lowestGretest(int arr[], int search ) {
		int start =0;
		int end = arr.length-1;
		int nearestLowest = 0;
		int nearestGretest=0;
		int mid = 0;
//		for(int i =0; i<arr.length;i++) 
		while(start<=end)
		{
			 mid = (start+end)/2;
			if(search ==arr[mid]) {
//				System.out.println("Element found :"+arr[i]);
//				return mid;
			}
			else if(search>arr[mid]) {
				start = arr[mid]+1;
				nearestLowest=arr[mid];
//				System.out.println("Lowest:"+ nearestLowest);
			}
			else if(search<arr[mid]) {
				end= arr[mid]-1;
				nearestGretest=arr[mid];
//				System.out.println("Gretest: "+nearestGretest);
			}
		}
		System.out.println(nearestLowest+ nearestGretest);
		return -1;
	}

	public static void main(String[] args) {
          int arr[]= {10, 12, 15, 17, 19, 20, 25, 27, 30, 35, 40};
          int search =29;
           int res= lowestGretest(arr, search);
          System.out.println("Element Found at index:"+res);
	}

}
