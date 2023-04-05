
public class SortedArrayOrNot {
	public static void sortedOrNot(int arr[]) {
		for(int i=0;i<=arr.length;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println("NOT SORTED");
				return;
			}
			else {
				System.out.println("SORTED");
				return;
			}
		}
	}
   public static void main(String[] args) {
	   int arr[] = {10,20,30, 40,  50,60};
	   sortedOrNot(arr);
}
}
