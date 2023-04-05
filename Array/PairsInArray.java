
public class PairsInArray {
	public static void pair(int arr[]) {
		int totalpair =0;
		for(int i= 0;i<arr.length;i++) {
			int curr= arr[i];
			for(int j=i+1;j<arr.length;j++) {
				System.out.print("("+curr+","+arr[j]+")");	
				totalpair++;
			}
			System.out.println();
		}
		System.out.println("total pair :"+totalpair);
	}

	public static void main(String[] args) {
        int arr[]= {3,5,7,9,11};
        pair(arr);
	}

}
