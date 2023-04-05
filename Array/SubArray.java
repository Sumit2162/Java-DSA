
public class SubArray {
	public static void printSubarray(int arr[]) {
		int tp=0;
		for(int i=0;i<arr.length;i++) {
			int start = i;
			for(int j=i;j<arr.length;j++) {
				int end=j;
				for(int k=start;k<=end;k++) {
				System.out.print(arr[k]+" ");	
				}
				tp++;
				System.out.println();
				
			}
			System.out.println();
		}
		System.out.println("total subarray: "+tp);

	}

	public static void main(String[] args) {
         int arr[]= {3,4,5,6,7,8,9,10};
         printSubarray(arr);
	}

}
