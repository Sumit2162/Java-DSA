
public class LargestElement_2 {
	public static void Aproach_2(int arr[],int n) {
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("MAX :"+max);
	}

   public static void main(String[] args) {
	   int arr[]= {10,30,20,5,40,23};
	   int n=arr.length;
		Aproach_2(arr,n);
}
}
